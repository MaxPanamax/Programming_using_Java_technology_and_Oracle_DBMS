package CW_Lesson_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> {
			String threadName = Thread.currentThread().getName();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Hello form" + threadName);
		});
		executor.execute(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello agen form" + threadName);
		});
		executor.shutdown();
	}

}
