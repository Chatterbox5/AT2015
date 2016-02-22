package livre;

public class Patient implements Comparable{

	private String name="";
	private int priority=0;
	
	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}
	
	@Override
	public int compareTo(Object pat) {
		// TODO Auto-generated method stub
		return priority-((Patient) pat).getPriority();
	}
	
}
