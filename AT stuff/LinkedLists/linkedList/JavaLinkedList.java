package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

import polynomial.Term;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum()
	{
		double total=0;
		ListIterator<Integer> ite = this.list.listIterator();
		while(ite.hasNext())
			total+=ite.next();

		return total;
	}

	public double getAvg()
	{
		int count=0;
		ListIterator<Integer> ite = this.list.listIterator();
		while(ite.hasNext()){
			count++;
		}
			System.out.println(count);
		return getSum()/count;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		ListIterator<Integer> ite = this.list.listIterator();
		while(ite.hasNext()){
			int i=ite.next();
			if(i>largest)
				largest=i;
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		ListIterator<Integer> ite = this.list.listIterator();
		while(ite.hasNext()){
			int i=ite.next();
			if(i<smallest)
				smallest=i;
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		ListIterator<Integer> ite = this.list.listIterator();
		while(ite.hasNext()){
			output+=ite.next()+",";
		}
//		
//		output+= "\n Average"+getAvg();
		output+= "\n Sum: "+getSum();
		output+= "\n Largest: "+getLargest();
		output+= "\n Smallest: "+getSmallest();
		output+= "\n";
		return output;
	}
}