package Packed_Task2_HW_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

	 private CurrencyConverter converter;

	    @BeforeEach
	    public void setUp() {
	        converter = new CurrencyConverter();
	        converter.setRates(1, 0.85, 0.73, 110);
	    }

	    @Test
	    public void testConvertUSDToEUR() {
	        double convertedAmount = converter.convert(100, "USD", "EUR");
	        Assertions.assertEquals(85, convertedAmount);
	    }

	    @Test
	    public void testConvertEURToUSD() {
	        double convertedAmount = converter.convert(100, "EUR", "USD");
	        Assertions.assertEquals(117, convertedAmount);
	    }

	    @Test
	    public void testConvertGBPToUSD() {
	        double convertedAmount = converter.convert(100,"USD", "GBP");
	        Assertions.assertEquals(73, convertedAmount);
	    }
	    @Test
	    public void testConvertJPYToUSD() {
	        double convertedAmount = converter.convert(100, "USD", "JPY");
	        Assertions.assertEquals(11000, convertedAmount);
	    }

}
