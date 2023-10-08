package oopsConcepts;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(4,6);
		Fraction f2 = new Fraction(10,3); 
		
//		f1.setNumerator(32);
//		f1.getNumerator();
//		f1.setDenominator(8);
//		f1.getDenominator();
//		f1.add(f2);
		Fraction f3 = Fraction.add(f1, f2);
		

		f3.print();
	}

}
