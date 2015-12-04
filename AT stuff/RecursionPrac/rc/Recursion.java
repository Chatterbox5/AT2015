package rc;

public class Recursion {

	public int factorial(int num){
		int product=1;
		for(int i=num;i>0;i--){
			product*=i;
		}
		return product;
	}
	
	public int factorialRec(int num){
		if(num==1)
			return 1;
		else
			return num*factorialRec(num-1);
	}
	
	public int fib(int num){
		if(num==1||num==2)
			return 1;
		else
			return fib(num-1)+fib(num-2);
	}
	
	public String rev(String str){
		if(str.length()==1)
			return str;
		else
			return str.substring(str.length())+rev(str.substring(0,str.length()));
		
	}
	
	public void fillArray(String [][] array, int row, int col){
		
		    if (row < array.length) {
		        if (col < array[row].length) {
		            array[row][col] = "*";
		            fillArray(array, row, col + 1);
		        } else {
		            fillArray(array, row + 1, 0);
		        }
		    }
		
		
		
	}
	
	
}
