package CW_Lesson_4;

public class NoMain3 implements Runnable{
	public int value;
	public NoMain3(int v) {
		this.value=v;
	}
@Override
public void run() {
	int limit=this.value/2;
	System.out.println("**** the thead"+Thread.currentThread().getName()+"startd with"+this.value);
	while(this.value>=0) {
		System.out.println("From"+Thread.currentThread().getName()+"valua= "+this.value);
		this.value-=1;
		if(this.value<=limit&&Thread.currentThread().isInterrupted()) {
			System.out.println("****** thew thread is integretion****");
			return;
		}
		try {
			Thread.sleep(300);;
			
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
		System.out.println("**** the thead"+Thread.currentThread().getName()+"has finished");
}
}
