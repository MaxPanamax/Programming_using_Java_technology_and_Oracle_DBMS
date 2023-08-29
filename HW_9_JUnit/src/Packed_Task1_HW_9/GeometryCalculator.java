package Packed_Task1_HW_9;

public class GeometryCalculator {
	 // Метод для вычисления площади треугольника
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    // Метод для вычисления площади прямоугольника
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    // Метод для вычисления площади квадрата
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    // Метод для вычисления площади ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }
}
