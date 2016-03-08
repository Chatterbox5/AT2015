package autoparts;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();

	}
	
	public void addEntry(Part x){
		if(partsMap.containsKey(x))
			partsMap.put(x, partsMap.get(x)+1);
		else
			partsMap.put(x, 1);
	}
	
	public String toString()
	{
		String output="";
		Set<Part> kys =  partsMap.keySet();

		for(Part x : kys){
			output += x.toString() + " - " + partsMap.get(x) + "\n";
		}


		return output;
	}
}