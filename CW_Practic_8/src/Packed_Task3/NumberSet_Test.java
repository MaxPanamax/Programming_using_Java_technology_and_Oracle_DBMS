package Packed_Task3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberSet_Test {

	private NumberSet numberSet;

    @BeforeEach
    public void setUp() {
        numberSet = new NumberSet();
    }

    @Test
    public void testGetSum() {//сумма
        numberSet.addNumber(1);
        numberSet.addNumber(2);
        numberSet.addNumber(3);

        Assertions.assertEquals(6, numberSet.getSum());
    }

    @Test
    public void testGetAverage() {//среднее значение
        numberSet.addNumber(1);
        numberSet.addNumber(2);
        numberSet.addNumber(3);

        Assertions.assertEquals(2, numberSet.getAverage());
    }

    @Test
    public void testGetMaximum() {//максимум
        numberSet.addNumber(1);
        numberSet.addNumber(2);
        numberSet.addNumber(3);

        Assertions.assertEquals(3, numberSet.getMaximum());
    }

    @Test
    public void testGetMinimum() {//минимум
        numberSet.addNumber(1);
        numberSet.addNumber(2);
        numberSet.addNumber(3);

        Assertions.assertEquals(1, numberSet.getMinimum());
    }

}
