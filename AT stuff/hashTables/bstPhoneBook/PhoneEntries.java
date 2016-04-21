package bstPhoneBook;

public class PhoneEntries implements Comparable {

	private String name;
	private String number;

	public PhoneEntries(String myName, String myNumber) {
		name = myName;
		number = myNumber;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(PhoneEntry other) {
		return this.toString().equals(other.toString());
	}

	public String toString() {
		return "Name: " + name + " Number: " + number;
	}

	public int compareTo(Object arg0) {
		PhoneEntry other = (PhoneEntry) arg0;
		return this.toString().compareTo(other.toString());
	}

}