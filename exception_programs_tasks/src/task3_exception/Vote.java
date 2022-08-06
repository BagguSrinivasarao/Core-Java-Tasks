package task3_exception;

import javax.activation.MailcapCommandMap;

public class Vote {
	
public static  void check(int age) throws Exception

{
	if(age<18)
		
	{
		throw new Exception("not eligible for vote");
	}
	
	else
		
	{
		System.out.println("Eligible for vote");
	}
}

 public static void main(String []args) throws Exception
 
 {
	 
	 check(13);
	 
 }
 
}

