package uniquesAndDupes;


import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		String[] words = input.split(" ");
		for(String word:words)
			uniques.add(word);
		
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		Set<String> temp = new TreeSet<String>();
		String[] words = input.split(" ");
		for(String word:words)
			if(!temp.add(word))
				dupes.add(word);
		
		return dupes;
	}
}