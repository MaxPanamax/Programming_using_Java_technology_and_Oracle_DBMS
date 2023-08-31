package Packed_Task1;


public class Fraction {
	 private int numerator;
	    private int denominator;

	    public Fraction(int numerator, int denominator) {
	        this.numerator = numerator;
	        this.denominator = denominator;
	    }

	    public Fraction multiply(Fraction other) {
	        int newNumerator = this.numerator * other.numerator;
	        int newDenominator = this.denominator * other.denominator;
	        return new Fraction(newNumerator, newDenominator);
	    }

	    public Fraction divide(Fraction other) {
	        int newNumerator = this.numerator * other.denominator;
	        int newDenominator = this.denominator * other.numerator;
	        return new Fraction(newNumerator, newDenominator);
	    }

	    public Fraction add(Fraction other) {
	        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
	        int newDenominator = this.denominator * other.denominator;
	        return new Fraction(newNumerator, newDenominator);
	    }

	    public Fraction subtract(Fraction other) {
	        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
	        int newDenominator = this.denominator * other.denominator;
	        return new Fraction(newNumerator, newDenominator);
	    }

	    public String toString() {
	        return numerator + "/" + denominator;
	    }
	}
	
	
	

