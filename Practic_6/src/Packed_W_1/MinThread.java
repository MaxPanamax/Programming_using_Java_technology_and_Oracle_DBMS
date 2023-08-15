package Packed_W_1;

public class MinThread extends Thread{
	 private int[] arr;
	    private int min;

	    public MinThread(int[] arr) {
	        this.arr = arr;
	    }

	    public int getMin() {
	        return min;
	    }

	    @Override
	    public void run() {
	        min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	    }
}
