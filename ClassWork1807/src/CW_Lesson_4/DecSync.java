package CW_Lesson_4;

public class DecSync implements Runnable{
	int limit;
	public DecSync(int limit) {
		this.limit=limit;
	}
	@Override
	public void run() {
		for(int i=0;i<limit;i++) {
			synchronized(Sync_main.locker) {
				Sync_main.counter--;
				System.out.println("Counter= "+ Sync_main.counter);	
			}
		}
	}
}
