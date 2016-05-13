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

public class PQRunner
{
	public static void main ( String[] args )
	{

		MonsterPQ pq = new MonsterPQ();
		pq.add(new Monster(1, 1, 1));
		pq.add(new Monster(2, 2, 2));
		pq.add(new Monster(1, 2, 3));
		pq.add(new Monster(3, 2, 1));
		pq.add(new Monster(2, 1, 3));
		pq.add(new Monster(2, 3, 1));
		pq.add(new Monster(3, 1, 2));
		pq.add(new Monster(3, 3, 3));
		
		System.out.println(pq);
		System.out.println("getMin(): "+pq.getMin());
		System.out.println("removeMin(): "+pq.removeMin());
		System.out.println(pq);
		System.out.println("getMin(): "+pq.getMin());
		System.out.println("removeMin(): "+pq.removeMin());
		
		
		
	}
}