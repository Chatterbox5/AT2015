package intTable;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
		System.out.println("add");
		int i = obj.hashCode();
		table[i].addFirst(obj);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int i=0;i<table.length;i++){
			output+= "\nbucket "+i;
			ListIterator iterator=table[i].listIterator();
			while(iterator.hasNext()){
				Number thing= (Number) iterator.next();
				output+=thing.getValue()+" ";
			}
		}
		return output;
	}
}