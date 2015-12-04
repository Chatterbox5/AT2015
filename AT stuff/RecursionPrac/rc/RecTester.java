package rc;

import java.util.Arrays;

public class RecTester {

	public static void main(String[] args) {
	Recursion r= new Recursion();

	String[][] a= new String[5][7];
	r.fillArray(a,0,0);
	//System.out.println(r.fib(9));
	//System.out.println(r.rev("Banana"));
	for(String[] str:a){	
		for(String str1:str)
			System.out.print(str1);
		System.out.println();
	}
	}
}
