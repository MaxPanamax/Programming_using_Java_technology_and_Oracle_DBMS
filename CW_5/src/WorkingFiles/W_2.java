package WorkingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class W_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = ""; // путь к файлу
        String wordToFind = ""; // слово для поиска

        // получаем путь к файлу и слово для поиска с помощью Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        filePath = scanner.nextLine();
        System.out.print("Введите слово для поиска: ");
        wordToFind = scanner.nextLine();
        scanner.close();

        // открываем файл и ищем слово
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // выводим количество найденных слов на экран
        System.out.println("Слово \"" + wordToFind + "\" встречается в файле " + filePath + " " + count + " раз(а)");
	}

}
