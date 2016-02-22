package myQueue;

public class MyQueueTester {

	public static void main(String[] args)

	{

		ArrayListQueue tc = new ArrayListQueue ();

		System.out.println(tc.offer("quarter"));

		System.out.println(tc.offer("dime"));

		System.out.println(tc.offer("nickel"));

		System.out.println(tc.offer("penny"));

		System.out.println( "\ntoString()\n" + tc);

		System.out.println( "\npeek(): " + tc.peek());

		System.out.println( "\nsearch for dime: " + tc.search("dime"));

		System.out.println( "\nsearch for euro: " + tc.search("euro"));

		System.out.println( "\nSize: " + tc.size());

		System.out.println("\npoll() and isEmpty(): ");

		while (!tc.isEmpty())

			System.out.println(tc.poll());

	}
}