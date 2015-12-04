package rational;

public class Test {

	public static void main(String[] args) {
		Rational r1 = new Rational(6,8);
		System.out.println(r1);
		
		Rational r2 = new Rational(3,9);
		System.out.println(r2);
		
		System.out.println("r1 equals r2? " + r1.equals(r2));
		System.out.println("r2 equals r1? " + r2.equals(r1));
		
		if(r1.compareTo(r2) > 0)
			System.out.println("r1 is bigger than r2");
		else if(r1.compareTo(r2) == 0)
			System.out.println("They are the same thing");
		else
			System.out.println("r1 is smaller than r2");
		
		System.out.println("reciprocal of r1 is " + r1.getReciprocal());
		
		System.out.println("r1 + r2 = " + r1.add(r2));
		System.out.println("r1 - r2 = " + r1.subtract(r2));
		System.out.println("r1 / r2 = " + r1.divide(r2));
		System.out.println("r1 * r2 = " + r1.multiply(r2));
	}
	
}
