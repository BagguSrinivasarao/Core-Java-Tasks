package task14;

import java.util.HashMap;
import java.util.Scanner;

public class Benz {
	

		static int a = 9;
		
		static int b=15;
		
		static int c=5;
		
		public void benzTypes()
		{
			HashMap type = new HashMap();
			
			type.put("Benz GLA", a);
			
			type.put("Benz E-Class",b);
			
			type.put("Benz GLS3", c);
			
			System.out.println("choose which car you want");
			
			System.out.println("Enter the number for which type you want");
			
			Scanner scan = new Scanner(System.in);
			
			int y = scan.nextInt();
			
			switch(y)
			{
			
			case 1: System.out.println("You are Selected Benz GLA");
			
			 a=a-1;
			 
			 type.replace("Benz GLA", a);
			 
			 System.out.println("present count is :"+type.get("Benz GLA"));
			 break;
			 
			case 2:
				System.out.println("You are selected Benz E-Class");
				
				b=b-1;
				
				type.replace("Benz E-Class", b);
				
				System.out.println("Present Benz E-Class : "+type.get("Benz E-Class"));
				break;
				
			case 3: System.out.println("You are selected Benz  GLS");
			
			c=c-1;
			
			type.replace("Benz GLS", b);
			
			System.out.println("Present Audi Q3 Count : "+type.get("Benz GLS"));
			break;
			
				
			}
			
		}

}
