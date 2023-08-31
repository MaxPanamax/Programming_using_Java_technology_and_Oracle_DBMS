package Packed_Task2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Calculator_Test {

	 @Test
	    public void testSum() {
	        int result = Calculator.sum(2, 3);
	        Assertions.assertEquals(5, result);
	    }

	    @Test
	    public void testSubtraction() {
	        int result = Calculator.subtract(5, 3);
	        Assertions.assertEquals(2, result);
	    }

	    @Test
	    public void testMultiplication() {
	        int result = Calculator.multiply(4, 3);
	        Assertions.assertEquals(12, result);
	    }

	    @Test
	    public void testDivision() {
	        double result = Calculator.divide(10, 2);
	        Assertions.assertEquals(5.0, result);
	    }

	    @Test
	    public void testMaximum() {
	        int result = Calculator.maximum(7, 5);
	        Assertions.assertEquals(7, result);
	    }

	    @Test
	    public void testMinimum() {
	        int result = Calculator.minimum(7, 5);
	        Assertions.assertEquals(5, result);
	    }

	    @Test
	    public void testPercentage() {
	        double result = Calculator.percentage(50.0, 200.0);
	        Assertions.assertEquals(100, result);
	    }

	    @Test
	    public void testPower() {
	        double result = Calculator.power(2, 3);
	        Assertions.assertEquals(8.0, result);
	    }
}
