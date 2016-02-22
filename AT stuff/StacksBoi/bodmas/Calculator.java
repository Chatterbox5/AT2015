package bodmas;

public class Calculator {

	public static void main(String[] args) {
		Operands bob= new Operands();
		
		System.out.println(bob.notationToNum("4 + 2 * 10 - 3 * 2"));
		System.out.println(bob.notationToNum("3 * ( 4 + 2 ) + 5"));

	}

}
