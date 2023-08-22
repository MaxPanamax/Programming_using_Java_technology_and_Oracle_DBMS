package WorkingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class W_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BufferedReader reader = new BufferedReader(new FileReader(""));//путь к файлу

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
