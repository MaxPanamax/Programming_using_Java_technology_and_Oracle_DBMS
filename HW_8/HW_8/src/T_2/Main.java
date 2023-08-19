package T_2;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите путь к файлу: ");
        String filePath = br.readLine();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Файл не существует");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new RandomNumberGenerator(file));
        executor.submit(new PrimeNumberFinder(file));
        executor.submit(new FactorialCalculator(file));

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Статистика:");
        System.out.println("Количество случайных чисел, записанных в файл: " + RandomNumberGenerator.getCount());
        System.out.println("Количество простых чисел, найденных в файле: " + PrimeNumberFinder.getCount());
        System.out.println("Количество факториалов, найденных в файле: " + FactorialCalculator.getCount());
    }
}

class RandomNumberGenerator implements Runnable {
    private final File file;
    private static int count = 0;

    public RandomNumberGenerator(File file) {
        this.file = file;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("random_numbers.txt"));
            Random rand = new Random();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line);
                for (int i = 0; i < n; i++) {
                    int randomNumber = rand.nextInt();
                    writer.write(randomNumber + "\n");
                    count++;
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class PrimeNumberFinder implements Runnable {
    private final File file;
    private static int count = 0;

    public PrimeNumberFinder(File file) {
        this.file = file;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("prime_numbers.txt"));
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line);
                for (int i = 2; i <= n; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        writer.write(i + "\n");
                        count++;
                    }
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FactorialCalculator implements Runnable {
    private final File file;
    private static int count = 0;

    public FactorialCalculator(File file) {
        this.file = file;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("factorials.txt"));
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line);
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                writer.write(fact + "\n");
                count++;
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
