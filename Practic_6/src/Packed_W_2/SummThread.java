package Packed_W_2;

public class SummThread extends Thread  {
private int [ ]arr;
private int summ=0;
	public  SummThread(int []arr) {
	this.arr=arr;
	}
	public int getSumm() {
		return summ;
	}
	 @Override
	    public void run() {
		 for (int i = 0; i < arr.length; i++) {
		        summ += arr[i];
		    }
	    }
}
