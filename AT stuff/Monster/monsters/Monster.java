package monsters;
public class Monster implements Comparable{

	private int weight;
	private int height;
	private int age;

	public Monster(){
		weight=0;
		height=0;
		age=0;
	}

	public Monster(int ht, int wt, int age){
		weight=ht;
		height=wt;
		this.age=age;
	}

	public void setWeight(int wt){
		weight=wt;
	}

	public void setHeight( int ht){
		height=ht;
	}

	public void setAge( int age){
		this.age=age;
	}

	public Object clone(){
		return new Monster(height, weight, age);
	}

	public int getWeight(){
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public boolean equals( Monster o ){
		if(height==o.getHeight()&&weight==o.getWeight()&&age==o.age)
			return true;
		return false;

	}
	public String toString( ){
		String ret="";
		ret+=height+" ";
		ret+=weight+" ";
		ret+=age;
		return ret;
	}


	@Override
	public int compareTo(Object o) {
		if(height==((Monster) o).getHeight())
			return 0;
		else if(height>((Monster) o).getHeight())
			return 1;
		else if(height<((Monster) o).getHeight())
			return -1;
		else if(weight==((Monster) o).getWeight())
			return 0;
		else if(weight>((Monster) o).getWeight())
			return 1;
		else if(weight<((Monster) o).getWeight())
			return -1;
		else if(age==((Monster) o).getAge())
			return 0;
		else if(age>((Monster) o).getAge())
			return 1;
		else if(age<((Monster) o).getAge())
			return -1;
		return 0;
	}

}

