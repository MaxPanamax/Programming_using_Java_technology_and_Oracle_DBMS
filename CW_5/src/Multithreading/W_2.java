package Multithreading;

import java.util.Scanner;

public class W_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Введите размер массива: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Введите элемент массива: ");
	            array[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        for (int i : array) {
	            sum += i;
	        }
	        System.out.println("Сумма элементов массива: " + sum);

	        double average = (double) sum / n;
	        System.out.println("Среднее арифметическое: " + average);
	}

}
