package rational;

import java.security.InvalidParameterException;

public class Rational {

	private int numerator;
	private int denominator;
	public Rational (int numerator, int denominator){
		if(denominator <= 0)
			throw new InvalidParameterException("D is too small");
		
		this.numerator = numerator; 
		this.denominator = denominator;
		
		reduce();
	}
	
	
	public int getNumerator() {
		return numerator;
	}


	public int getDenominator() {
		return denominator;
	}

	public Rational getReciprocal() {
		return new Rational(denominator, numerator);
	}
	
	public Rational add(Rational r){
		return new Rational(numerator* r.getDenominator() + denominator*r.getNumerator(), denominator* r.getDenominator());
	}
	public Rational subtract(Rational r){
		return new Rational(Math.abs(numerator* r.getDenominator() - denominator*r.getNumerator()), denominator* r.getDenominator());
	}

	public Rational multiply(Rational r){
		return new Rational(numerator * r.getNumerator(), denominator * r.getDenominator());
	}
	
	public Rational divide(Rational r){
		return this.multiply(r.getReciprocal());
	}
	
	public int gcf(int a, int b)
    {
        while (a != 0 && b != 0)
        {
            if (a >= b)
            {
                a = a - b;
            }
            else
                b = b - a;
        }
        if (a == 0) return b;
        else return a;
    }
	
	private void reduce() {
		int gcf= gcf(numerator,denominator);
		
			numerator/=gcf;
			denominator/=gcf;
		
	}
	
	public boolean equals(Rational ra){
		
		if(this.getNumerator()==ra.getNumerator()&&this.getDenominator()==ra.getDenominator())
			return true;
		return false;
	}
	
	public double compareTo(Rational ra){
		double thisRational = (double)numerator/denominator;
		double otherRational = (double)ra.getNumerator() / ra.getDenominator();
		return thisRational - otherRational;
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
}
