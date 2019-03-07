
public class InsufficientBalance extends Exception
{
	public InsufficientBalance() {

	}

	public InsufficientBalance(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Printing the stack trace");
		super.printStackTrace();
	}

	public void printException() {
		System.out.println("The exception was caused by InsufficientBalance amount");
	}
}
