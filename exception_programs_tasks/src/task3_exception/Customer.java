package task3_exception;

import java.util.Scanner;

public class Customer {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Available Balance in Account");
	
	double avlbal = scan.nextDouble();
	
	System.out.println("Available Balance:"+avlbal);
	
	System.out.println("Enter the withDraw amount");
	
	int wdraw = scan.nextInt();
	
	if(wdraw>avlbal)
		
	{
		throw new InSufficientBalanceException("Exceeding the limit in the amount");
	}
	
	else
		
	{
		
		System.out.println("Collect the amount");
		
	}
	
}
}
