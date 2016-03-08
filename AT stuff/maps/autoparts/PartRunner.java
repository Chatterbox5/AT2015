package autoparts;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PartRunner
{
	public static void main(String[] args) throws IOException
	{
		PartList bob = new PartList();
		BufferedReader k = new BufferedReader(new FileReader(new File("maps/autoparts/partinfo.dat")));       

		for(int x = 1; x <= 8; x++){
			Part reggg = new Part(k.readLine());
			bob.addEntry(reggg);
		}

		out.println(bob);
	}
}
