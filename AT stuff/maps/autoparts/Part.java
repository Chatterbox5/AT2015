package autoparts;

import java.util.Map;


public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		year=Integer.parseInt(list[5]);
		model=list[4];
		make=list[3];
		rest=list[0]+list[1]+list[2];

	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getRest() {
		return rest;
	}

	public int getYear() {
		return year;
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		
		return 0;
	}

	public String toString()
	{
		return "";
	}
}