package monsters;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
//Make the PQ an Arraylist, make the arrayList behave as a PQ
public class YourPQ
{
	private ArrayList<Monster> pQueue;

	public YourPQ()
	{
		pQueue= new ArrayList<Monster>();
	}

	public void add(Monster value) {
		pQueue.add(value);
		swapUp(pQueue.size() - 1);
	}

	public void swapUp(int bot) {
		if (bot > 0) {
			int parent = (bot - 1) / 2;
			if (pQueue.get(parent).compareTo(pQueue.get(bot))>0) {
				swap(parent, bot);
				swapUp(parent);
			}
		}
	}
	
	public void swap(int fir, int sec){
		Monster bob=pQueue.get(fir);
		pQueue.set(fir,pQueue.get(sec));
		pQueue.set(sec,bob);
	}
	
	public Object getMin()
	{
		return pQueue.get(0);
	}
	
	public Object removeMin()
	{
		return pQueue.remove(0);
	}
	
	public String getNaturalOrder()
	{
		String output="";
		for (int i=0; i<pQueue.size(); i++)
			output+=pQueue.get(i);
		return output;		
	}

	//write a toString method
	
	
}