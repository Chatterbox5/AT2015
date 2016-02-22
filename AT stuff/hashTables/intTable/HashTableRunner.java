package intTable;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;

public class HashTableRunner
{
	public static void main ( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader k = null;
		try {
			k = new BufferedReader(new FileReader(new File("H:\\git\\AT-CS-2015\\Ishaan Attri ATCS 2015\\Maps\\hashtables\\numbers.dat")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		HashTable fred = new HashTable();

		while(k.ready()){
			fred.add(new Number(Integer.parseInt(k.readLine())));
		}

		System.out.println(fred);
	}
}