package Packed_W_3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class NumbersThread_Main {

	public static void main(String[] args) {
			
		// Имя файла, который вам нужно прочитать
	    String fileName = "input.txt";
	    // Имя файла, в который вы хотите записать нечетные числа
	    String outputFileName = "output.txt";
	    // Имя файла, в который вы хотите записать четные числа
	    String outputFileName2 = "output2.txt";

	    try {
	      // Создаем объекты файла и сканера
	      File file = new File(fileName);
	      Scanner scanner = new Scanner(file);

	      // Создадим массив для хранения чисел
	      ArrayList<Integer> numbers = new ArrayList<Integer>();

	      // Читаем каждую строку файла
	      while (scanner.hasNextLine()) {
	        String line = scanner.nextLine();
	        // Переводим строку в число и добавляем его в массив
	        int number = Integer.parseInt(line);
	        numbers.add(number);
	      }

	      // Создаем поток файловой записи
	      FileWriter writer = new FileWriter(outputFileName);
	      FileWriter writer2 = new FileWriter(outputFileName2);
	      // Проходим по всем элементам массива и записываем в файл только нечетные числа
	      for (int number : numbers) {
	        if (number % 2 != 0) {
	          // Записываем нечетное число в файл
	          writer.write(Integer.toString(number));
	          writer.write("\n");  // Добавляем перенос строки
	        }else { writer2.write(Integer.toString(number));
	          writer2.write("\n");}
	      }

	      // Закрываем потоки
	      scanner.close();
	      writer.close();
	      writer2.close();

	    } catch (FileNotFoundException e) {
	      // Обрабатываем исключение, если файл не найден
	      System.out.println("Файл не найден: " + fileName);
	      e.printStackTrace();
	    } catch (IOException e) {
	      // Обрабатываем исключение, если произошла ошибка при записи в файл
	      System.out.println("!Ошибка при записи в файл!");
	      e.printStackTrace();
	    }
	}
	}
	
