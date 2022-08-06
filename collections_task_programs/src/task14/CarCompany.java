package task14;

import java.util.Scanner;

public class CarCompany {
	
	public static void main(String[] args) {
		
		Benz benz = new Benz();
		
		Audi audi = new Audi();
		
		Volvo volvo = new Volvo();
		
		Scanner scan = new Scanner(System.in);
		
		
			System.out.println("Avalable Cars are : Benz, Audi and Volvo");
			
			System.out.println("Select 1 for Benz and 2 for Audi and 3 for Volvo");
			
			int x = scan.nextInt();
			
			switch(x)
			{
			case 1:
				System.out.println("You are Selected Benz");
				
				benz.benzTypes();
				
				break;
				
			case 2:
				System.out.println("You are Selected Audi");
				
				audi.audiTypes();
				
				break;
				

			case 3:
					System.out.println("You are Selected Audi");
					
					volvo.volvoTypes();
					
					break;
					
					default:System.out.println("Please Enter Valid input");
			
		}
		
	}

}
