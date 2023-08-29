package Packed_Task4_HW_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLengthConverter {

	@Test
	void testLengthConverter() {
		LengthConverter app=new LengthConverter();
		 assertEquals(100000,app.ConvertCentim(1000000));
		 assertEquals(10000,app.ConvertDecim(1000000));
		 assertEquals(1000,app.ConvertMetr(1000000));
		 assertEquals(1,app.ConvertKilometr(1000000));
		}

}