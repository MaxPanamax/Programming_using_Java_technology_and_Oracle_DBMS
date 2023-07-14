package BankPack;

public class OperationException extends Throwable {
	public OperationException(java.lang.Throwable ex,String str) {
		System.out.println(ex.getMessage()+str);
	}
	public OperationException(java.lang.String str) {
		System.out.println(str);
	}
}
