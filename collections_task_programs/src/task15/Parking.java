package task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Parking {
	
	public void parkingDetails() {
	
	HashMap bike = new HashMap();
	
	HashMap car = new HashMap();

	ArrayList list1 = new ArrayList();
	
	ArrayList list2 = new ArrayList();
	
	for(int i =1;i<=15;i++)
	{
		bike.put(i,"Bashment-1");
	}
	
	for(int j=1;j<=15;j++)
	{
		car.put(j,"Bashment2");
	}
	
	while(true)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose Bike for 1 or Car for 2");
		
		int choose = scan.nextInt();
		
		if(choose==1)
		{
		System.out.println("Enter your Bike Number");
		
		String bikeNo = scan.next();
		
		if(list1.contains(bikeNo))
			{
			
			System.out.println("This Slot already booked for this vechicle number");
			
			}
		else
		{
			list1.add(bikeNo);
			
			System.out.println("Available Slots are in Bashement1");
			
			Set set = bike.entrySet();			
			Iterator itr = set.iterator();
			
			while(itr.hasNext())
			{
				Map.Entry entry = (Entry) itr.next();
				
				System.out.println(entry.getKey());
			}
			
			System.out.println("Enter the Slot Number");
			
			int slotNo = scan.nextInt();
			
			if(bike.containsKey(slotNo))
			{
				System.out.println("Slot is Booked");
				
				System.out.println("Yoyr Slot number is:"+slotNo);
				
				bike.remove(slotNo);
			}
			
			else
			{
				System.out.println("Please Enter Valid slot Number from the list");
			}
		}
	}
	
	else if(choose==2)
	{
		
		System.out.println("Enter your Car Registered number");
		
		String carNo = scan.next();
		
		if(list1.contains(carNo))
			{
			
			System.out.println("This Slot already booked for this vechicle number");
			
			}
		else
		{
			list1.add(carNo);
			
			System.out.println("Available Slots are in Bashement2");
			
			//Set set2 = car.entrySet();
			
			Iterator itr2 = (Iterator) car.entrySet().iterator();
			
			while(itr2.hasNext())
			{
				Map.Entry entry2 = (Entry) itr2.next();
				
				System.out.println(entry2.getKey());
			}
			
			System.out.println("Enter the Slot Number for Car");
			
			int slotNo = scan.nextInt();
			
			if(bike.containsKey(slotNo))
			{
				System.out.println("Yoyr Slot number is:"+slotNo);
				
				bike.remove(slotNo);
			}
			
			else
			{
				System.out.println("Please Enter Valid slot Number from the list");
			}
	}
	
	}
	}
	
	}
}
