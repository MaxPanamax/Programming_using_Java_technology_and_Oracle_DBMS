package WorkingFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class W_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // получаем путь к четырем файлам
            System.out.print("Введите путь к первому файлу: ");
            String file1Path = br.readLine();
            System.out.print("Введите путь ко второму файлу: ");
            String file2Path = br.readLine();
            System.out.print("Введите путь к третьему файлу: ");
            String file3Path = br.readLine();
            System.out.print("Введите путь к четвертому файлу: ");
            String file4Path = br.readLine();

            // читаем содержимое первых трех файлов и записываем в четвертый файл
            FileInputStream fis1 = new FileInputStream(file1Path);
            FileInputStream fis2 = new FileInputStream(file2Path);
            FileInputStream fis3 = new FileInputStream(file3Path);
            FileOutputStream fos = new FileOutputStream(file4Path);
            int byteCount = 0;
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = fis1.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }
            while ((bytesRead = fis2.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }
            while ((bytesRead = fis3.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }

            // закрываем потоки
            fis1.close();
            fis2.close();
            fis3.close();
            fos.close();

            // выводим количество перенесенных байт
            System.out.println("Количество перенесенных байт: " + byteCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
