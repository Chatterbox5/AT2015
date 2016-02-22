package students;

public class Student implements Comparable {
	private String last;
	private String first;
	private int id;

	public Student(String last, String first, int id){
		this.last=last;
		this.first=first;
		this.id=id;
	}

	public String getLast() {
		return last;
	}

	public String getFirst() {
		return first;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Object arg0) {
		if(first.charAt(0)>((Student) arg0).getFirst().charAt(0))
			return 1;
		if(first.charAt(0)==((Student) arg0).getFirst().charAt(0))
			return 0;
		else
			return -1;
	}
	
	public String toString(){
		return first+" "+last+" "+id;
	}


}
