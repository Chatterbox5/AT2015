package team;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TeamSet {

	private HashSet<Wrestler> set;

	public TeamSet(){
		set=new HashSet<Wrestler>();
	}

	public void add(Wrestler obj){
		set.add(obj);
	}

	public int getAverageWeight(){
		int sum=0;
		for(Wrestler bob:set)
			sum+=bob.getWeight();
		return sum/set.size();
	}

	public Set<Wrestler> getLightweights(){
		Set<Wrestler> lite=new HashSet<Wrestler>();
		for(Wrestler bob:set)
			if(bob.getWeight()<120)
				lite.add(bob);
		return lite;
	}
	
	@Override
	public String toString() {
		return set.toString();
	}

}
