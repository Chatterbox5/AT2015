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
	
	public boolean isEmpty(){
		return pQueue.size() == 0;
	}
	
	public void swapDown(int top) {
		int root = 0;
		while(root < pQueue.size()){
			int left = root*2+1, right = root*2+2;
			int max = root;
			if(left < pQueue.size())
				if(pQueue.get(left).compareTo(pQueue.get(max)) < 0)
					max = left;
			if(right < pQueue.size())
				if(pQueue.get(right).compareTo(pQueue.get(max)) < 0)
					max = right;
			
			if(max > root){
				swap(max, root);
				root = max;
			}
			else
				break;
		}
	}
	
	public String getNaturalOrder()
	{
		String output="";
		for (int i=0; i<pQueue.size(); i++)
			output+=pQueue.get(i);
		return output;		
	}

	public String toString() {
		return pQueue.toString();
	}
	
	
}