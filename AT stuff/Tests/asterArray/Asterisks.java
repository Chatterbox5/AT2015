package asterArray;

import java.util.ArrayList;

public class Asterisks {

	private ArrayList<Object> filling;
	private Object[][] table;

	public Asterisks(){
		ArrayList<Object> bob=new ArrayList<Object>();
		for(int i=0;i<30;i++)
			bob.add("*");
		for(int i=0;i<70;i++)
			bob.add(randomWithRange(1,10));
//		for(int i=0;i<100;i++)
//			filling.add(bob.remove(randomWithRange(0,bob.size()+1)));
		filling=bob;
		table=new Object[10][10];
	}

	private int randomWithRange(int start, int end){
		int ret= (int) (Math.random()*(end-start)+1);
		return ret;	
	}
	
	public void fillArrayHelp(){
		fillArray(table,0,0);
	}

	public void fillArray(Object [][] array, int row, int col){
		if (row < array.length) {
			if (col < array[row].length) {
				array[row][col] = filling.remove(0);
				fillArray(array, row, col + 1);
			} 
			else {
				fillArray(array, row + 1, 0);
			}
		}	
	}

	public String print() {
		String str="";
		for(Object[] obj:table)
			for (Object obj2: obj)
				str+=obj;
		str+="/n";
		return str;
	}

	public int sum(){
		
	}
}
