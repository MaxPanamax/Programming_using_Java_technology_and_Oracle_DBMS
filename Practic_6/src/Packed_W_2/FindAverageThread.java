package Packed_W_2;

public class FindAverageThread extends Thread {
	private int [ ]arr;
	private int summ=0;
	private int  average=0;
		public  FindAverageThread(int []arr) {
		this.arr=arr;
		}
		public int getAverage() {
			return  average;
		}
		 @Override
		    public void run() {
			 for (int i=0;i<arr.length;i++) {
			       summ += arr[i];
			   }
			    average = summ / arr.length;
//find=IntStream.of(arr).average();
		    }
}
