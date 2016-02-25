package phoneBook;

import java.util.Hashtable;
import java.util.LinkedList;


public class PhoneBook {

	private Hashtable<Integer, LinkedList<PhoneEntry>> table;
	private int numSlots;
	
	public PhoneBook(){
		numSlots=10;
		table= new Hashtable<Integer, LinkedList<PhoneEntry>>();
	}

	public PhoneBook(int numSlots){
		this.numSlots=numSlots;
		table= new Hashtable<Integer, LinkedList<PhoneEntry>>();
	}

	public void add(Object obj){

		
	}
	
	public void display(){

	}
	
	public int getCapacity(){

	}
	
	public int getSize(){

	}
	
	public void load(){

	}
	
	public int getNumberOfNulls(){

	}
	
	public int getLongestList(){

	}
	
	public String lookup(String lookFor){

	}
	
	public boolean changeNumber(String lookFor, String newNumb){

	}

}
