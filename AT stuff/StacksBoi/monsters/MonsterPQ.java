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

public class MonsterPQ  
{
	private Queue<Monster> pQueue;

	public MonsterPQ()
	{
		pQueue= new PriorityQueue();
	}

	public void add(Monster obj)
	{
		pQueue.add(obj);
	}

	public Object getMin()
	{
		return pQueue.peek();
	}

	public Object removeMin()
	{
		return pQueue.poll();
	}

	public String getNaturalOrder()
	{
		String output="";
		while(pQueue.isEmpty())
			output+=pQueue.poll()+"; ";
		return output;		
	}

	public String toString(){
		return pQueue.toString();
	}
}