package CW_Lesson_4;

public class Thread_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No_main t1=new No_main();
		t1.setDaemon(true);
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		int  laps=1000;
		while(laps>0) {
			System.out.println(".");
			laps--;
		}
	}

}
