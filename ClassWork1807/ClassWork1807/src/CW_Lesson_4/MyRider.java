package CW_Lesson_4;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyRider implements Runnable {
	FileReader fr = null;
	Object locker;

	public MyRider(String filePath, Object locker) {
		try {
			this.fr = new FileReader(filePath);
			this.locker = locker;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void run() {
		int lineCounter = 0;
		String str = "";
		BufferedReader br = new BufferedReader(fr);
		try {
			while ((str = br.readLine()) != null) {
				System.out.println("Reader:" + str);
				if ((lineCounter++) % 2 == 0) {
					synchronized (locker) {
						Main_Write.line = str;
						locker.notify();
						locker.wait();
					}
				}
			}
			synchronized (locker) {
				Main_Write.line = str;
				locker.notify();
				locker.wait();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}
