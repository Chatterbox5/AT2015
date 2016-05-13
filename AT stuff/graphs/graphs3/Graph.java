package graphs3;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Graph {

	private TreeMap<String, TreeSet<Integer>> map;
	
	public Graph(){
		map.put("AB", new TreeSet<Integer>(new ArrayList<Integer>(5,2,8))));
		map.put("BC", new TreeSet<Integer>());
		map.put("AC", new TreeSet<Integer>());
		map.put("AD", new TreeSet<Integer>());
		map.put("DC", new TreeSet<Integer>());
		map.get("AB").add(arg0);
	}
}
