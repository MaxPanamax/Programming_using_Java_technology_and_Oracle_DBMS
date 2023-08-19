package CW_Lesson_4;

public class Flow_control_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowControl flowControl=new FlowControl();
		Thread producerThread=new Thread (new Producer(flowControl));
		Thread consumserThread =new Thread(new Consummer(flowControl));
		
		producerThread.start();
		consumserThread.start();
	}

}
