package myQueue;

import java.util.ArrayList;

public class ArrayListQueue implements MyQueue{

	private ArrayList list;

	public ArrayListQueue(){
		list= new ArrayList();
	}

	public boolean offer(Object item) {
		// TODO Auto-generated method stub
		list.add(item);
		return true;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return list.remove(0);
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.size()==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public int search(Object a) {
		// TODO Auto-generated method stub
		for( int i=0; i<list.size();i++)
			if(list.get(i)==a)
				return i+1;
		return -1;
	}
	
	public String toString(){
		String str="";
		for(int i=0; i<list.size();i++){
			str+=list.get(i)+"\n";
		}
		return str;
	}

}
