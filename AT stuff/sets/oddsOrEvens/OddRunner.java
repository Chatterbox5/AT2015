package oddsOrEvens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		try(BufferedReader in=new BufferedReader(new FileReader("sets/oddsOrEvens/oddevendata.dat"))) {
			String str;
			while((str=in.readLine())!=null) 
				System.out.println(new OddEvenSets(str));
				
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
}