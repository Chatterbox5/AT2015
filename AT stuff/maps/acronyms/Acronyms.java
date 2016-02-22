package acronyms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Acronyms
{
	private Map<String,String> acr;

	public Acronyms()
	{
		acr=new HashMap<String, String>();
	}

	public void putEntry(String entry)
	{
		String[] values = entry.split(" - ");
		acr.put(values[0], values[1]);
	}

	public String convert(String sent)
	{
		StringBuilder s = new StringBuilder();
		
		Consumer<String> acronym = x ->{
			boolean hasPeriod = x.contains(".");
			x = x.replaceAll("\\.", "");
			if(acr.containsKey(x))
				x = acr.get(x);
			s.append(x + (hasPeriod?".":"") + " ");
		};
		
		Arrays.stream(sent.split(" ")).forEach(acronym);

		return s.toString();
	}

	public String toString()
	{
		return acr.toString();
	}
}