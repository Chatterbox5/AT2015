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

public class YourPQ
{
	private Queue pQueue;

	public YourPQ()
	{


	}

	public void add(int value) {
		pQueue.add(value);
		swapUp(pQueue.size() - 1);
	}

	public void swapUp(int bot) {
		if (bot > 0) {
			int parent = (bot - 1) / 2;
			if (pQueue.get(parent) < pQueue.get(bot)) {
				swap(parent, bot);
				swapUp(parent);
			}
		}
	}
	
	public Object getMin()
	{
		return "";
	}
	
	public Object removeMin()
	{
		return "";
	}
	
	public String getNaturalOrder()
	{
		String output="";



		return output;		
	}

	//write a toString method
	
	
}