package autoparts;

import java.util.Map;


public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String rock) 
	{
		String[] arr = rock.split(" ");
		make = arr[arr.length - 3];
		model = arr[arr.length - 2];
		year = Integer.parseInt(arr[arr.length - 1]);
		rest = rock.substring(0, rock.indexOf(make));
		

	}

	public int compareTo( Part other )
	{
		return this.toString().compareTo(other.toString());
	}

	public String toString()
	{
		return make + " " + model  + " " + year + " " + rest;
	}
}