package Multithreading;

import java.util.Scanner;

public class W_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Введите размер массива: ");
	    int size = scanner.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Введите элементы массива:");

	    for (int i = 0; i < size; i++) {
	      arr[i] = scanner.nextInt();
	    }

	    MaxThread maxThread = new MaxThread(arr);
	    MinThread minThread = new MinThread(arr);

	    maxThread.start();
	    minThread.start();

	    try {
	      maxThread.join();
	      minThread.join();
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    System.out.println("Максимальное значение: " + maxThread.getMax());
	    System.out.println("Минимальное значение: " + minThread.getMin());
	  }
	}

	class MaxThread extends Thread {
	  private int[] arr;
	  private int max;

	  public MaxThread(int[] arr) {
	    this.arr = arr;
	    max = Integer.MIN_VALUE;
	  }

	  public int getMax() {
	    return max;
	  }

	  public void run() {
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] > max) {
	        max = arr[i];
	      }
	    }
	  }
	}

	class MinThread extends Thread {
	  private int[] arr;
	  private int min;

	  public MinThread(int[] arr) {
	    this.arr = arr;
	    min = Integer.MAX_VALUE;
	  }

	  public int getMin() {
	    return min;
	  }

	  public void run() {
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
	}

}
