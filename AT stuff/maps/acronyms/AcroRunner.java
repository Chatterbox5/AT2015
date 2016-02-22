package acronyms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		String filename="maps/acronyms/acro.dat";
		BufferedReader k = new BufferedReader(new FileReader(new File(filename)));
		Acronyms bob=new Acronyms();
//		Scanner chop = new Scanner(filename);
		int loop=0;
		loop=Integer.parseInt(k.readLine());
		for(int i=0;i<loop;i++)
			bob.putEntry(k.readLine());
		String str="";
		String fin="";
		while((str=k.readLine())!=null)
			fin+=str;
		System.out.println(bob.toString());
		System.out.println(bob.convert(fin));
		
	}
}