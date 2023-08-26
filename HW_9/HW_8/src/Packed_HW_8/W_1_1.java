package Packed_HW_8;

import java.util.Arrays;

public class W_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // Создаем массив случайно сгенерированных целых чисел
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200) - 100;
        }

        // Используем Stream API для фильтрации чисел по заданным условиям
        long positiveCount = Arrays.stream(numbers)
                .filter(n -> n > 0)
                .count();

        long negativeCount = Arrays.stream(numbers)
                .filter(n -> n < 0)
                .count();

        long palindromeCount = Arrays.stream(numbers)
                .filter(n -> Math.abs(n) >= 10 && Math.abs(n) <= 99 && isPalindrome(n))
                .count();
        long twoDigitNumberseCount=Arrays.stream(numbers)
                .filter(num -> Math.abs(num) >= 10 && Math.abs(num) <= 99)
                .count();
        

        // Выводим результаты на экран
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Количество двухзначных чисел: " +twoDigitNumberseCount); 
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество зеркальных двузначных чисел: " + palindromeCount);
    }

    // Метод для проверки, является ли число палиндромом
    private static boolean isPalindrome(int number) {
        String str = String.valueOf(Math.abs(number));
        return str.equals(new StringBuilder(str).reverse().toString());
    
	}

}
