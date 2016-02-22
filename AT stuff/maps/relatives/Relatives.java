package relatives;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;
	private ArrayList<String> bob= new ArrayList<String>();

	public Relatives()
	{
		map = new HashMap<String,Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] things = line.split(" ");
		if(map.containsKey(things[0]))
			map.get(things[0]).add(things[1]);
		else {
			Set<String> temp = new HashSet<String>();
			temp.add(things[1]);
			map.put(things[0],temp);
		}
	}

	public String getRelatives(String person)
	{
		Set<String> relatives= map.get(person);
		String output=person+" is related to ";
		for(String str:relatives)
			output+=str+" ";
		return output;
	}


	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(String key : map.keySet())
			s.append(getRelatives(key) + "\n");
		return s.toString();
	}
}