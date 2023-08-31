package Paked_Number;

public class Number {
	 private int value;

	    public Number(int value) {
	        this.value = value;
	    }

	    public void setValue(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }

	    public String toOctal() {
	        return Integer.toOctalString(value);
	    }

	    public String toHexadecimal() {
	        return Integer.toHexString(value);
	    }

	    public String toBinary() {
	        return Integer.toBinaryString(value);
	    }
}
