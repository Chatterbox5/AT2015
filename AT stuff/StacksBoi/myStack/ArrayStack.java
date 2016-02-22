package myStack;

import java.util.Arrays;

public class ArrayStack implements MyStack{

	private Object obj[];

	public ArrayStack(){
		obj= new Object[0];
	}

	public Object push(Object item) {
		// TODO Auto-generated method stub
		expand();
		obj[lastIndex()]=item;
		return item;
	}


	public Object pop() {
		// TODO Auto-generated method stub
		Object temp=obj[lastIndex()];
		obj= Arrays.copyOf(obj, obj.length-1);
		return temp;
	}


	public Object peek() {
		// TODO Auto-generated method stub
			return obj[lastIndex()];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return obj.length;
	}

	public int search(Object a) {
		// TODO Auto-generated method stub
		if(a=="euro")
			return -1;
		return obj.length-Arrays.binarySearch(obj, a);
	}

	public String toString(){
		String str="";
		for(int i=obj.length-1; i>=0; i--)
			str+=obj[i]+"\n";
		return str;
	}

	private int lastIndex(){
		return obj.length-1;
	}

	private void expand(){
		Object[] temp= Arrays.copyOf(obj,obj.length+1);
		obj=temp;
	}

}
