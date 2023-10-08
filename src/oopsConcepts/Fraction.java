package oopsConcepts;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	private void simplify() {
		// TODO Auto-generated method stub
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2 ; i <= smaller ; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public void print() {
		System.out.println(numerator+" / "+denominator);
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;	
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		simplify();
		
	}

	public int getDenominator() {
		return denominator;
		
	}

	public void add(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDen = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum,newDen);
		return f3;
	}

}
