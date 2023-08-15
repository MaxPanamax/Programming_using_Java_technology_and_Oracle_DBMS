package Packed_W_1;

import java.util.Scanner;
/*Java предоставляет несколько способов ожидания завершения потоков.
Один из них - метод join() класса Thread, который заставляет вызвавший поток
ожидать завершения указанного потока. Если вызванный метод join() используется
в потоке t1 для ожидания завершения потока t2, то t1 будет приостановлен до тех пор,
пока t2 не завершится. Другой способ - использование метода wait() объекта.
С помощью метода notify() можно потом сигнализировать ждущему потоку о завершении операции
и переводить его в состояние "ожидающий" (waiting).
Наконец, можно использовать классы CountDownLatch и CyclicBarrier,
которые предоставляют более гибкие способы ожидания завершения нескольких потоков.*/

public class W_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // запрос значения переменной n - размера массива
	        System.out.print("Введите размер массива: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        // ввод значений элементов массива
	        System.out.println("Введите элементы массива:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // запуск потоков
	        MaxThread maxThread = new MaxThread(arr);
	        MinThread minThread = new MinThread(arr);
	        maxThread.start();
	        minThread.start();

	        // ожидание завершения потоков
	        try {
	            maxThread.join();
	            minThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // вывод результатов
	        System.out.println("Максимальное значение: " + maxThread.getMax());
	        System.out.println("Минимальное значение: " + minThread.getMin());
	    }
	}


