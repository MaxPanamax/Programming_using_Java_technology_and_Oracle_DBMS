package Paked_Number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number_Test {

	@Test
    public void testSetValue() {//чтение значения
        Number number = new Number(10);
        number.setValue(20);
        assertEquals(20, number.getValue());
    }

    @Test
    public void testToOctal() {//восьмеричную
        Number number = new Number(10);
        assertEquals("12", number.toOctal());
    }

    @Test
    public void testToHexadecimal() {//шестнадцатиртчную
        Number number = new Number(10);
        assertEquals("a", number.toHexadecimal());
    }

    @Test
    public void testToBinary() {//двоичную
        Number number = new Number(10);
        assertEquals("1010", number.toBinary());
    }

}
