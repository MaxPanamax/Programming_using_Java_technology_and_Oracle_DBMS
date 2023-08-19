package CW_Lesson_4;

import java.util.Random;

public class Thread_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=(new Random().nextInt(10));
		NoMain2 t2=new NoMain2(v);
		t2.setDaemon(true);
		v=(new Random().nextInt(10));
		NoMain2 t3=new NoMain2(v);
		t3.setDaemon(true);
		t2.start();
		t3.start();
		try {
			t2.join(1000);
			t3.join(1000);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
