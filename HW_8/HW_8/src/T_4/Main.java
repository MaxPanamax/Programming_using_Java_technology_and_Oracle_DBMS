package T_4;
import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к директории для поиска: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        System.out.print("Введите путь к файлу со списком запрещенных слов: ");
        String forbiddenWordsFilePath = scanner.nextLine();

        List<String> forbiddenWords = Files.readAllLines(Paths.get(forbiddenWordsFilePath));
        List<File> filesContainingSearchWord = new ArrayList<>();

        Thread searchThread = new Thread(() -> {
            try {
                Files.walk(Paths.get(directoryPath))
                        .filter(Files::isRegularFile)
                        .forEach(file -> {
                            try {
                                List<String> lines = Files.readAllLines(file);
                                for (String line : lines) {
                                    if (line.contains(searchWord)) {
                                        filesContainingSearchWord.add(file.toFile());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread forbiddenWordsThread = new Thread(() -> {
            try {
                searchThread.join();
                List<String> forbiddenWordsList = Files.readAllLines(Paths.get(forbiddenWordsFilePath));
                for (File file : filesContainingSearchWord) {
                    List<String> lines = Files.readAllLines(file.toPath());
                    StringBuilder sb = new StringBuilder();
                    for (String line : lines) {
                        String[] words = line.split(" ");
                        for (String word : words) {
                            if (!forbiddenWordsList.contains(word)) {
                                sb.append(word).append(" ");
                            }
                        }
                        sb.append(System.lineSeparator());
                    }
                    Files.write(file.toPath(), Collections.singletonList(sb.toString()));
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        searchThread.start();
        forbiddenWordsThread.start();

        searchThread.join();
        forbiddenWordsThread.join();

        System.out.println("Количество файлов, содержащих искомое слово: " + filesContainingSearchWord.size());
        System.out.println("Количество обработанных файлов: " + filesContainingSearchWord.size());
    }
}
