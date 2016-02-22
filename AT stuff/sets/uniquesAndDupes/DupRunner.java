package uniquesAndDupes;


import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String input1="a b c d e f g h a b c d e f g h i j k";
		String input2="one two three one two three six seven one two";
		String input3="1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		
		UniquesDupes bob=new UniquesDupes();
		
		System.out.println("Original List: "+input1);
		System.out.println("Uniques: "+bob.getUniques(input1));
		System.out.println("Dupes: "+bob.getDupes(input1));
		System.out.println();
		System.out.println("Original List: "+input2);
		System.out.println("Uniques: "+bob.getUniques(input2));
		System.out.println("Dupes: "+bob.getDupes(input2));
		System.out.println();
		System.out.println("Original List: "+input3);
		System.out.println("Uniques: "+bob.getUniques(input3));
		System.out.println("Dupes: "+bob.getDupes(input3));
		System.out.println();
	}
}