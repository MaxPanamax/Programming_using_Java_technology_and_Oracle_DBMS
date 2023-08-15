package Packed_W_2;

import java.util.Scanner;


public class W_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // запрос значения переменной n - размера массива
	        System.out.print("Введите размер массива: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        // ввод значений элементов массива
	        System.out.println("Введите элементы массива:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // запуск потоков
	        SummThread summThread = new SummThread(arr);
	        FindAverageThread findAverageThread = new FindAverageThread(arr);
	        summThread.start();
	        findAverageThread.start();

	        // ожидание завершения потоков
	        try {
	            summThread.join();
	            findAverageThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // вывод результатов
	        System.out.println("Сумма: " + summThread.getSumm());
	        System.out.println("Среднеарефмитическое: " + findAverageThread.getAverage());
	    }
	}


