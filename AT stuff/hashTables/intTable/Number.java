package intTable;

public class Number
{
	private int value;
	
	public Number(int value)
	{
		this.value=value;
	}	
	
	public int getValue()
	{
		return value;
	}
	
	public boolean equals(Object obj)
	{
		return ((Number)obj).getValue()==value;
	} 
	
	public int hashCode()
	{
		return value%10;
	}

	public String toString()
	{
		return value+"";
	}	
}