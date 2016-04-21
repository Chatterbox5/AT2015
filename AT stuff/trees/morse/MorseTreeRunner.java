package morse;

import java.io.FileNotFoundException;

public class MorseTreeRunner 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		MorseTree m = new MorseTree();
		
		System.out.println(m.getLetter(".-."));
		System.out.println(m.getMorse("R"));
		System.out.println(m.toEnglish(".-. --- .... .- -."));
		System.out.println(m.toMorse("ROHAN IS COOL"));
	}
	
}
