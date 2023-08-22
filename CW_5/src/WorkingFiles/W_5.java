package WorkingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class W_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Получаем путь к файлу и слово для замены от пользователя
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("Введите путь к файлу: ");
	            String filePath = reader.readLine();
	            System.out.println("Введите слово для поиска: ");
	            String wordToFind = reader.readLine();
	            System.out.println("Введите слово для замены: ");
	            String wordToReplace = reader.readLine();

	            // Открываем файл для чтения и создаем временный файл для записи
	            FileReader fileReader = new FileReader(filePath);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            File tempFile = new File("temp.txt");
	            FileWriter fileWriter = new FileWriter(tempFile);

	            // Читаем файл построчно и заменяем все вхождения слова
	            String line;
	            int replacements = 0;
	            while ((line = bufferedReader.readLine()) != null) {
	                line = line.replaceAll(wordToFind, wordToReplace);
	                fileWriter.write(line + "\n");
	                replacements += line.split(wordToReplace, -1).length - 1;
	            }

	            // Закрываем файлы и выводим количество замен на экран
	            fileReader.close();
	            fileWriter.close();
	            bufferedReader.close();
	            System.out.println("Количество замен: " + replacements);

	            // Заменяем исходный файл временным файлом
	            File originalFile = new File(filePath);
	            originalFile.delete();
	            tempFile.renameTo(originalFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
