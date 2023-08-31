package Packed_Task2;

public class Calculator {
	 public static int sum(int a, int b) {
	        return a + b;
	    }

	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        return a / b;
	    }

	    public static int maximum(int a, int b) {
	        return Math.max(a, b);
	    }

	    public static int minimum(int a, int b) {
	        return Math.min(a, b);
	    }

	    public static double percentage(double percentage, double number) {
	        return (percentage / 100) * number;
	    }

	    public static double power(double base, double exponent) {
	        return Math.pow(base, exponent);
	    }
}
