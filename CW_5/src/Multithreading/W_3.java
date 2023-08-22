package Multithreading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class W_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Введите путь к файлу: ");
	        String path = scanner.nextLine();
	        File file = new File(path);
	        try {
	            if (!file.exists()) {
	                if (file.createNewFile()) {
	                    System.out.println("Файл успешно создан.");
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        Thread oddThread = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                FileWriter fileWriter = null;
	                PrintWriter printWriter = null;
	                try {
	                    fileWriter = new FileWriter("odd.txt");
	                    printWriter = new PrintWriter(fileWriter);
	                    for (int i = 0; i < numbers.length; i++) {
	                        if (numbers[i] % 2 != 0) {
	                            printWriter.println(numbers[i]);
	                        }
	                    }
	                } catch (IOException e) {
	                    e.printStackTrace();
	                } finally {
	                    if (printWriter != null) {
	                        printWriter.close();
	                    }
	                    if (fileWriter != null) {
	                        try {
	                            fileWriter.close();
	                        } catch (IOException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                }
	            }
	        });
	        Thread evenThread = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                FileWriter fileWriter = null;
	                PrintWriter printWriter = null;
	                try {
	                    fileWriter = new FileWriter("even.txt");
	                    printWriter = new PrintWriter(fileWriter);
	                    for (int i = 0; i < numbers.length; i++) {
	                        if (numbers[i] % 2 == 0) {
	                            printWriter.println(numbers[i]);
	                        }
	                    }
	                } catch (IOException e) {
	                    e.printStackTrace();
	                } finally {
	                    if (printWriter != null) {
	                        printWriter.close();
	                    }
	                    if (fileWriter != null) {
	                        try {
	                            fileWriter.close();
	                        } catch (IOException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                }
	            }
	        });
	        oddThread.start();
	        evenThread.start();
	        try {
	            oddThread.join();
	            evenThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        int oddCount = 0;
	        int evenCount = 0;
	        Scanner oddScanner = null;
	        Scanner evenScanner = null;
	        try {
	            oddScanner = new Scanner(new File("odd.txt"));
	            evenScanner = new Scanner(new File("even.txt"));
	            while (oddScanner.hasNextInt()) {
	                oddCount++;
	                oddScanner.nextInt();
	            }
	            while (evenScanner.hasNextInt()) {
	                evenCount++;
	                evenScanner.nextInt();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (oddScanner != null) {
	                oddScanner.close();
	            }
	            if (evenScanner != null) {
	                evenScanner.close();
	            }
	        }
	        System.out.println("Количество нечетных элементов: " + oddCount);
	        System.out.println("Количество четных элементов: " + evenCount);
	}

}
