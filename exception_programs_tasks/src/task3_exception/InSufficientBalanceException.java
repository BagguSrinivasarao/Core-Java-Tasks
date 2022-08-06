package task3_exception;

public class InSufficientBalanceException extends RuntimeException {
public InSufficientBalanceException(String msg)
{
	System.out.println(msg);
	System.out.println("haiii");
}
}
