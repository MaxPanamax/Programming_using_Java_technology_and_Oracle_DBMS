package Packed_W_1;

public class MaxThread extends Thread{
	private int[] arr;
    private int max;

    public MaxThread(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }
}
