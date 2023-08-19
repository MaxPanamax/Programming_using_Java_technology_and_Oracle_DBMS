package CW_Lesson_4;

public class Producer implements Runnable{
private FlowControl flowControl;
public Producer (FlowControl flowControl) {
	this.flowControl=flowControl;
}
@Override
public void run() {
	for (int i=0;i<10;i++) {
		flowControl.addData("item"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			throw new RuntimeException(e);
		}
	}
}
}