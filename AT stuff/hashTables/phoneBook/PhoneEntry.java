package phoneBook;

public class PhoneEntry implements Comparable{

	private String name;
	private String number;
	
	public PhoneEntry(String na, String nu){
		name =na;
		number = nu;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String n) {
		number = n;
	}
	
	public int hashCode(){
		
		
		return name.hashCode();
	}
	
	public boolean equals(PhoneEntry other){
		
		return this.toString().equals(other.toString());
	}
	
	public String toString(){
		return name + " " + number;
	}

	
	public int compareTo(Object arg0) {
		PhoneEntry other = (PhoneEntry) arg0;
		return this.toString().compareTo(other.toString());
	}
	
	
}