package firstWorksheet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class FirstWorksheet {

	public static void main(String args[])
	{
		LinkedList staff=new LinkedList();
		staff.add("A");
		staff.add("B");
		staff.add("C");
		staff.add("F");

		//		reverse(staff);
		//		duplicate(staff);
		//		repeat(staff);
//		delete(staff,"T");
				ordered(staff, "D");


	}

	public static void reverse(LinkedList staff){
		ListIterator iterator= staff.listIterator();
		iterator=staff.listIterator();
		while(iterator.hasNext())
			iterator.next();
		while(iterator.hasPrevious())
			System.out.println(iterator.previous());
	}

	public static void duplicate(LinkedList<String> staff){
		ListIterator<String> iterator= staff.listIterator();
		iterator=staff.listIterator();
		while(iterator.hasNext()){
			String thing=iterator.next();
			System.out.print(thing);
			System.out.print(thing);
		}
	}

	public static void repeat(LinkedList<String> staff){
		ListIterator<String> iterator= staff.listIterator();
		iterator=staff.listIterator();
		while(iterator.hasNext()){
			String thing=iterator.next();
			System.out.print(thing);
		}
		iterator=staff.listIterator();
		while(iterator.hasNext()){
			String thing=iterator.next();
			System.out.print(thing);
		}
	}

	public static void delete(LinkedList<String> staff, String searchFor){
		ListIterator<String> iterator= staff.listIterator();
		while(iterator.hasNext())
			if(iterator.next().equals(searchFor))
				iterator.remove();

		iterator=staff.listIterator();
		while(iterator.hasNext()){
			String thing=iterator.next();
			System.out.print(thing);
		}
	}

	public static void ordered(LinkedList<String> staff, String obj){
		ListIterator<String> iterator= staff.listIterator();
		iterator.add(obj);
		Collections.sort(staff);
		iterator=staff.listIterator();
		while(iterator.hasNext()){
			String thing=iterator.next();
			System.out.print(thing);
		}
	}


}
