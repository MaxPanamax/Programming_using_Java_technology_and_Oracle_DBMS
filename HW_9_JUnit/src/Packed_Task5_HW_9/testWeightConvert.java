package Packed_Task5_HW_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Packed_Task4_HW_9.LengthConverter;

class testWeightConvert {

	@Test
	void testWeightConvert() {
		 WeightConvert app=new  WeightConvert();
		 assertEquals(1,app.ConvertGr(1000));
		 assertEquals(1,app.ConvertKg(1000000));
		 assertEquals(1,app.ConvertTon(100000000));
		 assertEquals(1,app.ConvertHundredweight(10000000));
	}

}
