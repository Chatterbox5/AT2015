package monsters;

import java.util.Scanner;

public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		MonsterPQ fred = new MonsterPQ();
		Scanner k= new Scanner(System.in);
		int ht = 0;
		int wt = 0;
		int age = 0;
		int num = 0;
		
		System.out.println("How Many Monsters do you wish to enter:");
		num = Integer.parseInt(k.nextLine());
		
		for(int i = 0; i < num; i++){
			System.out.println("Enter Height:");
			ht = Integer.parseInt(k.nextLine());
			System.out.println("Enter Weight:");
			wt = Integer.parseInt(k.nextLine());
			System.out.println("Enter Age:");
			age = Integer.parseInt(k.nextLine());
			System.out.println("");
			
			fred.add(new Monster(ht, wt, age));			
		}
		
		System.out.println(fred);
		
		
		System.out.println("getMin()");
		System.out.println(fred.getMin());
		
		System.out.println("");

		System.out.println("removeMin()");
		System.out.println(fred.removeMin());
		
		System.out.println("");

		System.out.println(fred);

		System.out.println("getMin()");
		System.out.println(fred.getMin());
		
		System.out.println("removeMin()");
		System.out.println(fred.removeMin());
		
		System.out.println("");

		System.out.println(fred);		
	}
}