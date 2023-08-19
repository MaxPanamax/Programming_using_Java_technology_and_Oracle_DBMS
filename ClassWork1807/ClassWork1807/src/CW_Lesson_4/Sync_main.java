package CW_Lesson_4;

public class Sync_main {
	public static int counter=0;
	public static Object locker=new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=2703;
		DecSync t6=new DecSync(limit);
		NecSync t7=new NecSync(limit);
		
		Thread thread1=new Thread(t6);
		Thread thread2=new Thread(t7);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
			
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Counter= "+counter);		
	}

}
