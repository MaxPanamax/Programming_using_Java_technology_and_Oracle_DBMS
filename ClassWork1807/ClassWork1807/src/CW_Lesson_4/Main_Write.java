package CW_Lesson_4;

public class Main_Write {
	public static String line = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object locker = new Object();
		MyRider reader= new MyRider("Line.txt", locker);
		MyWrite writer =new MyWrite("Lines_out.txt", locker);
		Thread t1=new Thread(reader);
		Thread t2=new Thread(writer);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t2.start();
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		t1.start();
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
