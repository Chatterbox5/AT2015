package translator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import oddsOrEvens.OddEvenSets;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;
	private ArrayList<String> bob=new ArrayList<String>();

	public SpanishToEnglish(String filePath) throws IOException
	{
		pairs= new HashMap<String, String>();
		BufferedReader in=new BufferedReader (new FileReader(filePath));
		String str;
		int c=Integer.parseInt(in.readLine());
		for(int i=0;i<c;i++){
			str=in.readLine();
			putEntry(str);
		}
		while((str=in.readLine())!=null) 
			bob.add(translate(str));
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent)
	{
		String[] list = sent.split(" ");
		String output ="";
		for(int i=0;i<list.length;i++)
			output+=pairs.get(list[i])+ " ";
	
		return " \n"+output;
	}

	public String toString()
	{
		String output=pairs.toString().replaceAll("\\,","\n");
		for(int i=0; i<bob.size()-1;i++)
			output+=bob.get(i);
		return output;
	}
}