package unionIntersectionDiff;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one=new TreeSet<Integer>();
		two=new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one=new TreeSet<Integer>();
		two=new TreeSet<Integer>();
		String[] arrayOne=o.split(" ");
		String[] arrayTwo=t.split(" ");

		for(String word:arrayOne)
			one.add(Integer.parseInt(word));

		for(String word:arrayTwo)
			two.add(Integer.parseInt(word));

	}

	public Set<Integer> union()
	{
		Set<Integer> one=new TreeSet<Integer>();
		Set<Integer> two=new TreeSet<Integer>();
		Set<Integer> full=new TreeSet<Integer>();
		one.addAll(this.one);
		two.addAll(this.two);
		for(int x:one)
			full.add(x);
		for(int x:two)
			full.add(x);
		return full;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> one=new TreeSet<Integer>();
		Set<Integer> two=new TreeSet<Integer>();
		Set<Integer> inter=new TreeSet<Integer>();
		one.addAll(this.one);
		two.addAll(this.two);
		for(int x:two)
			if(!one.add(x))
				inter.add(x);
		return inter;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> ret = new TreeSet<Integer>();
		ret.addAll(one);
		ret.removeAll(two);
		return ret;
	}

	public Set<Integer> differenceBMinusA()//prob
	{
		Set<Integer> ret = new TreeSet<Integer>();
		ret.addAll(two);
		ret.removeAll(one);
		return ret;
	}

	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> one=new TreeSet<Integer>();
		Set<Integer> two=new TreeSet<Integer>();
		one.addAll(this.one);
		two.addAll(this.two);
		for(int x:two)
			if(!one.add(x))
				one.add(x);
		return one;
	}	

	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}