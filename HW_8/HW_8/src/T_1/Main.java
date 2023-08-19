package T_1;

import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        int[] array = new int[10];
        Thread thread1 = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
            System.out.println("Поток 1 завершил заполнение массива");
        });
        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            System.out.println("Сумма элементов массива: " + sum);
        });
        Thread thread3 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum = 0;
            for (int i : array) {
                sum += i;
            }
            System.out.println("Среднее значение элементов массива: " + (double)sum / array.length);
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread2.join();
        thread3.join();
    }
}