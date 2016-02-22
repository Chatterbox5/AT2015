package translator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		SpanishToEnglish juan=new SpanishToEnglish("maps/translator/spantoeng.dat");
		System.out.println(juan);
	}
}