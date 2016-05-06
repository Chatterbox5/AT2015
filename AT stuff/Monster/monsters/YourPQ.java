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
	private Queue pQueue;

	public YourPQ()
	{
		pQueue= new PriorityQueue<Monster>();
	}

	public void add(Monster value) {
		pQueue.add(value);
		swapUp(pQueue.size() - 1);
	}

	public void swapUp(int bot) {
		if (bot > 0) {
			int parent = (bot - 1) / 2;
			if (pQueue.peek(parent) < pQueue.peek(bot)) {
				swap(parent, bot);
				swapUp(parent);
			}
		}
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
	public String getNaturalOrder()
	{
		String output="";



		return output;		
	}

	//write a toString method
	
	
}