package task14;

import java.util.HashMap;
import java.util.Scanner;

public class Volvo {

static int a = 15;
	
	static int b=4;
	
	static int c=16;
	
	public void volvoTypes()
	
	{
		HashMap type = new HashMap();
		
		type.put("Volvo C30", a);
		
		type.put("Volvo V40",b);
		
		type.put("Volvo XC60", c);
		
		System.out.println("choose which car you want");
		
		System.out.println("Enter the number for whic type");
		
		Scanner scan = new Scanner(System.in);
		
		int z = scan.nextInt();
		
		switch(z)
		{
		
		case 1: System.out.println("You are Selected Volvo C30");
		
		 a=a-1;
		 
		 type.replace("Volvo C30", a);
		 
		 System.out.println("present Volvo C30 count is :"+type.get("Volvo C 30"));
		 
		 break;
		 
		case 2:
			System.out.println("You are selected Volvo V40");
			
			b=b-1;
			
			type.replace("Volvo V40", b);
			
			System.out.println("Present Volvo V40 : "+type.get("Volvo V40"));
			
			break;
			
		case 3: System.out.println("You are selected Volvo XC60");
		
		c=c-1;
		
		type.replace("Volvo XC60", b);
		
		System.out.println("Present Audi Q3 Count : "+type.get("Volvo XC60"));
		
		break;
		
			
		}
		
	}
}
