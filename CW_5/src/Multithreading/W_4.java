package Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class W_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Введите путь к файлу: ");
	        String filePath = scanner.nextLine();
	        System.out.print("Введите слово для поиска: ");
	        String wordToSearch = scanner.nextLine();
	        scanner.close();

	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        String line;
	        int count = 0;

	        while ((line = reader.readLine()) != null) {
	            String[] words = line.split("\\s+");
	            for (String word : words) {
	                if (word.equalsIgnoreCase(wordToSearch)) {
	                    count++;
	                }
	            }
	        }

	        reader.close();
	        System.out.println("Количество слов \"" + wordToSearch + "\" в файле: " + count);
	}

}
