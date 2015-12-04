package maze;

import java.util.ArrayList;

public class Maze {

	private int x;
	private int y;
	private char[][] k;
	private String steps;
	private ArrayList<Character> letters = new ArrayList<Character>();
	
	public Maze(char[][] m, int x, int y) {
		this.y=y;
		this.x=x;
		k=m;
		steps="";
		for(int i=65;i<=90;i++)
			letters.add((char)i);
		
	}

	public void display() {
		for(char[] r:k){	
			for(char c:r){
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	public boolean findExit() {
		// TODO Auto-generated method stub
		return y==getYExit()&&x==getXExit();
	}

	public String getSteps() {
		// TODO Auto-generated method stub
		
		while(!findExit()){
			
			if(canGoUp() && !Character.isLetter(k[y-1][x])){
				//while(k[y-1][x] != '*' && y > 0)
				up();
				continue;
			}
			if(canGoRight() && !Character.isLetter(k[y][x+1])){
				//while(k[y][x+1] != '*' &&  x < k[0].length)
				right();
				continue;
			}
			if(canGoDown() && !Character.isLetter(k[y+1][x])){
				//while(k[y+1][x] != '*' && y < k.length)
				down();
				
			}
			if(canGoLeft() && !Character.isLetter(k[y][x-1])){
				//while(k[y][x-1] != '*' && x > 0)
				left();
				
			}
			
			
			
		}
		
		
		
		return null;
	}
	private boolean canGoRight(){
		return k[y][x+1] != '*' &&  x < k[0].length;
	}
	private boolean canGoUp(){
		return k[y-1][x] != '*' && y > 0;
	}
	private boolean canGoDown(){
		return k[y+1][x] != '*' && y < k.length;
	}
	private boolean canGoLeft(){
		return k[y][x-1] != '*' && x > 0;
	}
	private void up(){
		y--;
		k[y][x] = letters.remove(0);
		display();
	}
	private void down(){
		y++;
		k[y][x] = letters.remove(0);
		display();
	}
	private void left(){
		x--;
		k[y][x] = letters.remove(0);
		display();
	}
	private void right(){
		x++;
		k[y][x] = letters.remove(0);
		display();
	}

	public int getXExit() {
		// TODO Auto-generated method stub
		for(int i=0;i<k.length;i++){
			if(k[i][0]==' ')
				return 0;
			if (k[i][k[0].length-1]==' ')
				return k[0].length-1;
			if(k[0][i]==' ')
				return i;
			if (k[0][k[i].length-1]==' ')
				return k[i].length-1;
		}
		return -1;
	}

	public int getYExit() {
		// TODO Auto-generated method stub
		for(int i=0;i<k.length;i++){
			if(k[0][i]==' ')
				return 0;
			if (k[k[0].length-1][i]==' ')
				return k[0].length-1;
			if(k[i][0]==' ')
				return i;
			if (k[k[i].length-1][0]==' ')
				return k[i].length-1;
		}
		return -1;
	}

}
