package WorkingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class W_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите путь к файлу: ");
            String fileName = reader.readLine();
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            int charCount = 0;
            int digitCount = 0;
            int punctCount = 0;

            while ((line = br.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    if (Character.isLetter(c)) {
                        charCount++;
                    } else if (Character.isDigit(c)) {
                        digitCount++;
                    } else if (Character.isWhitespace(c)) {
                        continue;
                    } else {
                        punctCount++;
                    }
                }
            }

            System.out.println("Количество букв: " + charCount);
            System.out.println("Количество цифр: " + digitCount);
            System.out.println("Количество знаков препинания: " + punctCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
