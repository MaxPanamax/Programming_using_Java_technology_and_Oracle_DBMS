package CW_Lesson_4;

import java.io.FileWriter;
import java.io.IOException;


public class MyWrite implements Runnable{
FileWriter fw=null;
Object locker;
public MyWrite(String filePath ,Object locker) {
	try {
		this.fw=new FileWriter(filePath,true);
		this.locker=locker;
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
}

public void run() {
	synchronized(locker) {
		while(Main_Write.line!="exit") {
		 try {
			 locker.wait();
		 if(Main_Write.line!="exit") {
			 fw.write(Main_Write.line+System.getProperty("line.separator"));
		 }
		 System.out.println("***Write line:"+Main_Write.line);
		}catch(IOException | InterruptedException e){
			throw new RuntimeException(e);
		}
		 try {
			 fw.close(); 
		 }	 catch(Exception e){
			 throw new RuntimeException(e);
		 }
		 
	
	}
	}
}
}
	
