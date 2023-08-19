package T_3;
import java.io.*;
import java.io.IOException;

public class Main {
    private static int filesCopied = 0;
    private static int directoriesCreated = 0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите путь к существующей директории: ");
        String sourcePath = br.readLine();
        System.out.println("Введите путь к новой директории: ");
        String destinationPath = br.readLine();

        File sourceDir = new File(sourcePath);
        File destinationDir = new File(destinationPath);

        if (!sourceDir.isDirectory()) {
            System.out.println("Ошибка: " + sourcePath + " не является директорией.");
            return;
        }

        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
            directoriesCreated++;
        }

        copyDirectory(sourceDir, destinationDir);

        System.out.println("Скопировано файлов: " + filesCopied);
        System.out.println("Создано директорий: " + directoriesCreated);
    }

    private static void copyDirectory(File sourceDir, File destinationDir) throws IOException {
        File[] files = sourceDir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                File newDestinationDir = new File(destinationDir, file.getName());
                newDestinationDir.mkdir();
                directoriesCreated++;
                copyDirectory(file, newDestinationDir);
            } else {
                File newFile = new File(destinationDir, file.getName());
                copyFile(file, newFile);
            }
        }
    }

    private static void copyFile(File source, File destination) throws IOException {
        InputStream inStream = new FileInputStream(source);
        OutputStream outStream = new FileOutputStream(destination);

        byte[] buffer = new byte[1024];
        int length;

        while ((length = inStream.read(buffer)) > 0) {
            outStream.write(buffer, 0, length);
            filesCopied++;
        }

        inStream.close();
        outStream.close();
    }
}
