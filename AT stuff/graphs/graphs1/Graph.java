package graphs1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Graph
{
	private TreeMap<String, Set<String>> map;
	private boolean connected;

	public Graph(String line)
	{
		map = new TreeMap<String, Set<String>>();
		String[] lineArr = line.split(" ");
		for(int x = 0; x<lineArr.length; x++){
			if(map.keySet().contains(lineArr[x].substring(0, 1)))
				map.get(lineArr[x].substring(0, 1)).add(lineArr[x].substring(1));
			else
				map.put(lineArr[x].substring(0,1), new TreeSet<String>());
		}


	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String first, String second, String placesUsed)
	{
		if(placesUsed.contains(second))
			//true;
	}

	public String toString()
	{
		return "";
	}
}