package relatives;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader k = new BufferedReader(new FileReader(new File("maps/relatives/relatives.dat")));

		int count = Integer.parseInt(k.readLine());
		Relatives r = new Relatives();
		while (count > 0) {
			r.setPersonRelative(k.readLine());
			count--;
		}
		System.out.println(r.toString());
		String str;
		while((str=k.readLine())!=null) 
			System.out.println(r.getRelatives(k.readLine()));

	}
}