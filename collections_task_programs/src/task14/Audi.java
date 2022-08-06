package task14;

import java.util.HashMap;
import java.util.Scanner;

public class Audi {

	static int a = 20;
	
	static int b=8;
	
	static int c=10;
	
	public void audiTypes()
	{
		HashMap type = new HashMap();
		
		type.put("Audi A4", a);
		
		type.put("Audi A5 f5",b);
		
		type.put("Audi Q3", c);
		
		System.out.println("choose which car you want");
		
		System.out.println("Enter the number for whic type");
		
		Scanner scan = new Scanner(System.in);
		
		int z = scan.nextInt();
		
		switch(z)
		{
		
		case 1: System.out.println("You are Selected Audi A4");
		
		 a=a-1;
		 
		 type.replace("Audi A4", a);
		 
		 System.out.println("present Audi A4 count is :"+type.get("Audi A4"));
		 
		 break;
		 
		case 2:
			System.out.println("You are selected Audi A5 f5");
			
			b=b-1;
			
			type.replace("Audi A5 f5", b);
			
			System.out.println("Present Audi A5 f5: "+type.get("Audi A5 f5"));
			
			break;
			
		case 3: System.out.println("You are selected Audi Q3");
		
		c=c-1;
		
		type.replace("Audi Q3", b);
		
		System.out.println("Present Audi Q3 Count : "+type.get("Audi Q3"));
		
		break;
		
			
		}
		
	}
}
