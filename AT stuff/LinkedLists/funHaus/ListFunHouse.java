package funHaus;

import static java.lang.System.*;

public class ListFunHouse {
	// this method will print the entire list on the screen
	public static void print(ListNode list) {
		ListNode z = new ListNode(list.getValue(), null);
		while (list.getNext()!=null) {
			System.out.println(list.getValue());
			list = list.getNext();
		}
		System.out.println(list.getValue());
	}

	// this method will return the number of nodes present in list
	public static int nodeCount(ListNode list) {
		int count = 0;
		ListNode z = new ListNode(list.getValue(), null);
		while (list.getNext()!=null) {
			list = list.getNext();
			count++;
		}
		return count+1;
	}

	// this method will create a new node with the same value as the first node
	// and add this
	// new node to the list. Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list) {
		ListNode z = new ListNode(list.getValue(), list.getNext());
		list.setNext(z);
	}

	// this method will create a new node with the same value as the last node
	// and add this
	// new node at the end. Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list) {
		ListNode prev = null;
		while(list.getNext()!=null)
			list=list.getNext();
		list.setNext(new ListNode (list.getValue(),null));
	}

	// method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list) {
		removeXthNode(list,2);
	}

	// this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value) {
		int count = 1;
		ListNode temp= list;
		while(temp!=null){
			if(count%x==0)
				temp.setValue(value);
			temp=temp.getNext();
			count++;
		}
	}

	// this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x) {
		int count = 1;
		ListNode pre=null;
		ListNode temp= list;
		while(temp!=null){
			if(count%x==0)
				pre.setNext(temp.getNext());
			pre=temp;
			temp=temp.getNext();
			count++;
		}
	}
}