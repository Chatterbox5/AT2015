package students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClubMapTester {

	public static void main( String args[] ) throws IOException
	{
	String filePath="hashTables/students/student.txt";
	BufferedReader in=new BufferedReader (new FileReader(filePath));
	ClubMap bob=new ClubMap();
	String str="";
	while((str=in.readLine())!=null){
		String[] line=str.split("\t");
		Student stu= new Student(line[0],line[1],Integer.parseInt(line[2]));
		bob.add(line[3], stu);
	}
	
	bob.printClubs();
	System.out.println("Getting the Students in the ColorGuard Club");
	bob.printClubs("ColorGuard");
		
	}
}
