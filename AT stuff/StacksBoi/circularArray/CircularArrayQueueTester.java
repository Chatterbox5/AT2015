package circularArray;

public class CircularArrayQueueTester {
	public static void main(String[] args) {

		CircularArrayQueue a = new CircularArrayQueue(10);

		a.add(1);

		a.add(2);

		a.add(3);

		a.add(4);

		a.add(5);

		a.add(6);

		a.add(7);

		a.add(8);

		a.add(9);

		System.out.println(a);

		System.out.println("NEXT: " +a.remove());

		System.out.println("NEXT: "+a.remove());

		System.out.println("NEXT: "+a.remove());

		System.out.println("Removed 1, 2, and 3");
		
		System.out.println(a);

		a.add(10);

		System.out.println(a);

		a.add(11);

		System.out.println(a);

		a.add(12);

		System.out.println(a);

		System.out.println("NEXT: "+a.remove());
		
		System.out.println("Removed 4");

		System.out.println(a);

		System.out.println("Add 13, 14, 15:");
		
		a.add(13);

		System.out.println(a);

		a.add(14);

		System.out.println(a);

		a.add(15);

		System.out.println(a);

		System.out.println("NEXT: "+a.remove());

		System.out.println(a);

		System.out.println("Removed next");
		
	}
}
