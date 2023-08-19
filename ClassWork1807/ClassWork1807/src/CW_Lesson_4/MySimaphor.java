package CW_Lesson_4;

import java.util.concurrent.Semaphore;

public class MySimaphor implements Runnable{
Semaphore sem=new Semaphore(5);
int counter;
public MySimaphor(int c) {
	this.counter=c;
}
@Override
public void run() {
	try {
		sem.acquire();
		System.out.println(Thread.currentThread().getName()+"is working.."+this.counter);
		Thread.sleep(counter);
		System.out.println(Thread.currentThread().getName()+"is finished..");
		sem.release();
		
	}catch(InterruptedException e) {
		throw new RuntimeException(e);
	}
}
}
