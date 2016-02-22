package myStack;

public class MyStackTester {

public static void main(String[] args)

	{

		ArrayStack tc = new ArrayStack();

		System.out.println(tc.push("quarter"));

		System.out.println(tc.push("dime"));

		System.out.println(tc.push("nickel"));

		System.out.println(tc.push("penny"));

		System.out.println( "\ntoString():\n" + tc);

		System.out.println( "\npeek()" + tc.peek());

		System.out.println( "\nsearch for dime " + tc.search("dime"));

		System.out.println( "\nsearch for euro " + tc.search("euro"));

		System.out.println( "\nSize " + tc.size());

		System.out.println("pop() and isEmpty()");

		while (!tc.isEmpty())

			System.out.println(tc.pop());

	}
	
}