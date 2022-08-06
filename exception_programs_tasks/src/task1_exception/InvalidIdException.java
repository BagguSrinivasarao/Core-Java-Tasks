package task1_exception;

public class InvalidIdException extends RuntimeException{
	
	public InvalidIdException(String msg)
	
	{
		
		System.out.println(msg);
		
		System.out.println("Please Enter Valid Id");
	}
	
	
	
}
 