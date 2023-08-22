package WorkingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Введите путь к файлу: ");
	        String filePath = scanner.nextLine();
	        System.out.print("Введите запрещенные слова через запятую: ");
	        String[] bannedWords = scanner.nextLine().split(",");

	        List<String> lines = new ArrayList<>();
	        int count = 0;

	        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                for (String bannedWord : bannedWords) {
	                    line = line.replaceAll(bannedWord, "");
	                    count++;
	                }
	                lines.add(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        for (String line : lines) {
	            System.out.println(line);
	        }

	        System.out.println("Количество вырезанных слов: " + count);
	}

}
