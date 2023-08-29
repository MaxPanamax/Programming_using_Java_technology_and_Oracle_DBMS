package Packed_Task1_HW_9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class JUnit_Test_Task1 {

 // JUnit тесты для проверки вычисления площади фигур
    
    @Test
    public void testCalculateTriangleArea() {
        assertEquals(6.0, GeometryCalculator.calculateTriangleArea(4.0, 3.0), 0.0001);
    }
    
    @Test
    public void testCalculateRectangleArea() {
        assertEquals(12.0, GeometryCalculator.calculateRectangleArea(4.0, 3.0), 0.0001);
    }
    
    @Test
    public void testCalculateSquareArea() {
        assertEquals(16.0, GeometryCalculator.calculateSquareArea(4.0), 0.0001);
    }
    
    @Test
    public void testCalculateRhombusArea() {
        assertEquals(12.0, GeometryCalculator.calculateRhombusArea(6.0, 4.0), 0.0001);
    }

}
