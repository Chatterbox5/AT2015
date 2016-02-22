package oddsOrEvens;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds=new TreeSet<Integer>();
		evens=new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		odds=new TreeSet<Integer>();
		evens=new TreeSet<Integer>();
		String[] words = line.split(" ");
		ArrayList<Integer> nums= new ArrayList<Integer>();
		for(String word:words)
			nums.add(Integer.parseInt(word));

		for(int x:nums)
			if(x%2==0)
				evens.add(x);
			else
				odds.add(x);
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}