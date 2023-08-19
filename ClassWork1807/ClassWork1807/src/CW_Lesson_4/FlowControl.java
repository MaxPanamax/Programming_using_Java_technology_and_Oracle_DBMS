package CW_Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {
	private List<String> data=new ArrayList<>();
	private static final int max_size=5;
	public synchronized void addData(String item) {
		while(data.size()>=max_size) {
			try {
				wait();
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
		data.add(item);
		System.out.println("Added: "+item);
		 notify();
	}
	public synchronized String procesData() {
		while(data.isEmpty()) {
			try {
				wait();
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
		String item =data.remove(0);
		System.out.println("Proces: "+item);
		 notify();
		 return item;
	}
}
