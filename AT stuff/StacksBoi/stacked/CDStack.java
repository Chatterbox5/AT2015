package stacked;

import java.util.Stack;

import java.util.Iterator;

public class CDStack {
	Stack <String> myStack;
	
	public static void main (String[]args){
		CDStack cd= new CDStack();
//		cd.printCDs3();
//		cd.reverse();
//		System.out.println();
//		cd.printCDs3();
		cd.binary(34);
		cd.printCDs3();
	}
	
	public CDStack(){
		myStack= new Stack<String>();
		myStack.push("Journey");
		myStack.push("Iggy Pop");
		myStack.push("Hall and Oats");
		myStack.push("Genesis");
		myStack.push("Foreigner");
		myStack.push("Eagles");
		myStack.push("Deep Purple");
		myStack.push("Cheap Trick");
		myStack.push("Beatles");
		myStack.push("Aerosmith");
	}
	
	public String nextCD(){
		return myStack.peek();
	}
	
	public String playNextCD(){
		return myStack.pop();
	}
	
	public void printCD(){
		String str= myStack.peek();
		while(!myStack.empty()&&myStack.peek()!=null){
			System.out.println(str);
			str=myStack.pop();
		}
	}
	
	public void printCDs2(){
		Iterator<String> ite= myStack.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
	
	public void printCDs3(){
		Iterator<String> ite= myStack.iterator();
		for(String str: myStack)
			System.out.println(str);
	}
	
	public void printCDs4(){
		if(myStack.isEmpty())
			return;
		else{
			System.out.println(myStack.pop());
			printCDs4();
		}
	}
	
	public void reverse(){
		Stack newStack= new Stack();
		while(!myStack.empty()&&myStack.peek()!=null)
			newStack.push(myStack.pop());
		myStack=newStack;
	}
	
	public void binary(int num){
		Stack newStack= new Stack();
		while(num/2!=0)
			newStack.push(num%2);
		myStack=newStack;
	}
}
