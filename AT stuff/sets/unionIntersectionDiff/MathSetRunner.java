package unionIntersectionDiff;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import oddsOrEvens.OddEvenSets;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader k = new BufferedReader(new FileReader(new File("sets/unionIntersectionDiff/mathsetdata.dat")));       

		MathSet fred;
		for(int x = 1; x <= 3; x++){
	         fred = new MathSet(k.readLine(), k.readLine());
	         System.out.println("Test No. " + x);
	         System.out.println(fred+"\n");
	         System.out.println("UNION: " + fred.union());
	         System.out.println("INTERSECTION: " + fred.intersection());
	         System.out.println("DIFFERENCE A-B: " + fred.differenceAMinusB());
	         System.out.println("DIFFERENCE B-A: " + fred.differenceBMinusA());
	         System.out.println("DIFFERENCE SYMMETRIC: " + fred.symmetricDifference());
	         System.out.println("");
	    }

        k.close();
        
	}
}
