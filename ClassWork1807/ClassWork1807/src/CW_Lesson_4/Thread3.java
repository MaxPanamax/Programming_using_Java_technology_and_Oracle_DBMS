package CW_Lesson_4;

import java.util.Random;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=(new Random().nextInt(20));
		NoMain3 r4=new NoMain3(z);
		Thread t4=new Thread(r4);
		t4.setDaemon(true);
		 z=(new Random().nextInt(20));
		NoMain3 r5=new NoMain3(z);
		Thread t5=new Thread(r5);
		t4.setDaemon(true);
		t4.start();
		t5.start();
		//t5.interrupt();////прирывание потока принудительно
		try {
			t4.join();
			t5.join();
			
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
