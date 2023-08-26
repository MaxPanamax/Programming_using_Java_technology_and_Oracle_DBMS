package Packed_HW_8;

import java.util.Random;
import java.util.stream.IntStream;

public class W_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 10; // количество случайных чисел
	        
	        Random random = new Random();
	        
	        IntStream.range(0, count)
	                .map(i -> random.nextInt(90) + 10) // генерация двузначных чисел
	                .forEach(number -> {
	                    System.out.println("Сгенерировано число: " + number);
	                    
	                    int positiveCount = number > 0 ? 1 : 0; // проверка на положительное число
	                    int negativeCount = number < 0 ? 1 : 0; // проверка на отрицательное число
	                    int mirrorCount = isMirrorNumber(number) ? 1 : 0; // проверка на зеркальное число
	                    
	                    System.out.println("Положительные числа: " + positiveCount);
	                    System.out.println("Отрицательные числа: " + negativeCount);
	                    System.out.println("Зеркальные двузначные числа: " + mirrorCount);
	                });
	    }
	    
	    // метод для проверки, является ли число зеркальным
	    private static boolean isMirrorNumber(int number) {
	        String numberString = String.valueOf(number);
	        String reverseNumberString = new StringBuilder(numberString).reverse().toString();
	        int reverseNumber = Integer.parseInt(reverseNumberString);
	        
	        return number == reverseNumber;
	}

}
