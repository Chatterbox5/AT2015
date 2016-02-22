package histogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Histogram
{
	private Map<String, Integer> histogram;

	public Histogram()
	{
		histogram= new HashMap<String, Integer>();
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		histogram= new HashMap<String, Integer>();
		String[] words = sent.split(" ");
		for(String word:words){
			if(!histogram.containsKey(word))
				histogram.put(word,0);
			histogram.put(word,histogram.get(word)+1);
		}
		
	}

	public String toString()
	{
		String output="";
		Set<String> keys = histogram.keySet();
		for(String x : keys){
			output+=x+"\t";
			for(int i=0;i<histogram.get(x);i++)
				output+="*";
			output+="\n";
		}
		return output+"\n\n";
	}
}