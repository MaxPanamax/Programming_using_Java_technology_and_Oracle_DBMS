package Packed_W_4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath; // путь к файлу
	        String wordToSearch; // слово для поиска
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Введите путь: ");
	        filePath=scanner.next();
	        System.out.print("Введите слово: ");
	        wordToSearch=scanner.next();
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                if (line.contains(wordToSearch)) {
	                    System.out.println(line);
	                }else { System.out.print("Такого слова нет!"); }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	           
	        }
	}

}
