package graphs1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Graph
{
	private TreeMap<String, TreeSet<String>> map;
	boolean match = false;
	
	public Graph(String line) {
		map = new TreeMap<String, TreeSet<String>>();
		String[] a = line.split(" ");
		for (int i = 1; i < a.length; i++) {
			if (map.containsKey(a[i].substring(0, 1))) {
				TreeSet<String> t = map.get(a[i].substring(0, 1));
				t.add(a[i].substring(1));
				map.put(a[i].substring(0, 1), t);
			} else {
				TreeSet<String> t = new TreeSet<String>();
				t.add(a[i].substring(1));
				map.put(a[i].substring(0, 1), t);
			}

			if (map.containsKey(a[i].substring(1))) {
				TreeSet<String> t = map.get(a[i].substring(1));
				t.add(a[i].substring(0, 1));
				map.put(a[i].substring(1), t);
			} else {
				TreeSet<String> t = new TreeSet<String>();
				t.add(a[i].substring(0, 1));
				map.put(a[i].substring(1), t);
			}
		}
	}


	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String one, String two, ArrayList<String> been) {
		if (!match) {
			if (map.get(one).contains(two))
				match = true;
			else {
				TreeSet<String> set = map.get(one);
				for (String x : set)
					if (!been.contains(x)) {
						been.add(x);
						check(x, two, been);
					}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}