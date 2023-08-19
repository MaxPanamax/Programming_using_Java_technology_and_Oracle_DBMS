package CW_Lesson_4;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Simaphor_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random r =new Random();
//		 MySimaphor ms=new MySimaphor(r.nextInt(2000)+1000);
//		for(int i=0;i<20;i++) {
//			Thread t=new Thread(ms);
//			t.start();
//		}
		Runnable task = new Runnable() {
			Semaphore sem = new Semaphore(5);
			Random r = new Random();
			int counter = r.nextInt((2000) + 1000);

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {

					sem.acquire();
					System.out.println(Thread.currentThread().getName() + "is workink.." + this.counter);
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName() + "is finished..");
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		for (int i = 0; i < 20; i++) {
			new Thread(task).start();
		}
	}

}
