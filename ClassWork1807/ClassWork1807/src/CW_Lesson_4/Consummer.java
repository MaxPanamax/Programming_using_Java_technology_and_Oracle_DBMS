package CW_Lesson_4;


public class Consummer implements Runnable{
private FlowControl sharedResource;
public Consummer(FlowControl sharedResource) {
	this.sharedResource=sharedResource;
}
@Override
public void run() {
	for (int i=0;i<10;i++) {
		sharedResource.procesData();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			throw new RuntimeException(e);
		}
	}
}
}
