package CW_Lesson_4;

public class NoMain2 extends Thread{

	private int value;
	public NoMain2(int v) {
		this.value=v;
	}
	public void run() {
		while(this.value>=0) {
			System.out.println("**** the thead"+Thread.currentThread().getName()+"startd with"+this.value);
			while(this.value>=0) {
				System.out.println("From"+Thread.currentThread().getName()+"valua= "+this.value);
				this.value-=1;
				try {
					Thread.sleep(300);
				}catch(InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println("**** the thead"+Thread.currentThread().getName()+"has finished");
		}
	}
}
