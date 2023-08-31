package Packed_Task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTask1 {
	 @Test
	    public void testMultiply() {
	        Fraction fraction1 = new Fraction(1, 2);
	        Fraction fraction2 = new Fraction(3, 4);
	        Fraction expected = new Fraction(3, 8);
	        Fraction actual = fraction1.multiply(fraction2);
	        assertEquals(expected.toString(), actual.toString());
	    }

	    @Test
	    public void testDivide() {
	        Fraction fraction1 = new Fraction(1, 2);
	        Fraction fraction2 = new Fraction(3, 4);
	        Fraction expected = new Fraction(4, 6);
	        Fraction actual = fraction1.divide(fraction2);
	        assertEquals(expected.toString(), actual.toString());
	    }

	    @Test
	    public void testAdd() {
	        Fraction fraction1 = new Fraction(1, 2);
	        Fraction fraction2 = new Fraction(3, 4);
	        Fraction expected = new Fraction(5, 4);
	        Fraction actual = fraction1.add(fraction2);
	        assertEquals(expected.toString(), actual.toString());
	    }

	    @Test
	    public void testSubtract() {
	        Fraction fraction1 = new Fraction(1, 2);
	        Fraction fraction2 = new Fraction(3, 4);
	        Fraction expected = new Fraction(-1, 4);
	        Fraction actual = fraction1.subtract(fraction2);
	        assertEquals(expected.toString(), actual.toString());
	    }

}
