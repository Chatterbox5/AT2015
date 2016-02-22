package livre;

import java.util.ArrayList;

public class LiverTransplantQueue implements PriorityQueue{

	ArrayList<Patient> bob=new ArrayList<Patient>();
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return bob.size()==0;
	}

	@Override
	public void add(Object x) {
		for (int i=0; i<bob.size();i++){
			if(bob.get(i).compareTo(x)<0)// x has higher priority
				bob.add(i, (Patient) x);
		}
		
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return bob.remove(0);
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return bob.get(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return bob.size();
	}

}
