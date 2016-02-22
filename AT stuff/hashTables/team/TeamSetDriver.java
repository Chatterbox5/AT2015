package team;

public class TeamSetDriver {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TeamSet a=new TeamSet();
		a.add(new Wrestler("Bob",157));
		a.add(new Wrestler("Fred",129));
		a.add(new Wrestler("Jake",100));
		a.add(new Wrestler("Arnold",199));
		a.add(new Wrestler("Stan",120));

		Wrestler juan = new Wrestler("Juan",180);
		a.add(juan);
		System.out.println(a);
		System.out.println();
		System.out.println(a);
		System.out.println(a.getAverageWeight());
		System.out.println(a.getLightweights());
		
		

		}
}
