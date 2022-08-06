package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;



public class ArrayList1 {
	
ArrayList<Integer> al = new ArrayList<>();
	
	
	
	public void usingListIterator()
	
	{
	
		al.add(50);
		
		al.add(100);
		
		al.add(1000);
		
		al.add(30);
		
		al.add(100);
		
		ListIterator li = al.listIterator();
		
		System.out.println("Moving elements are in Forwad Direction");
		
		li.add(300);
		
		while(li.hasNext())
			
		{
			System.out.println(li.next());
			
		}
		
		System.out.println("Moving elements are in Backward direction");
		
		while(li.hasPrevious())
			
		{
			
			System.out.println(li.previous());
		}
		
	}
	
	public void addElement()
	
	{
		
		al.add(1, 500);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("After adding elemnt"+al);
	}
	
	public void stringascendingOrder()
	
	{
		ArrayList al3 = new ArrayList(Arrays.asList("Red","Green","Yellow","Pink","Blue"));
		
		System.out.println("Before sorting an array:");
		
		System.out.println(al3);
		
		
		Collections.sort(al3);
		
		System.out.println("-----------------------------");
		
		System.out.println("Sorting an arrayList");
		
		System.out.println(al3);

	}
	
	public void descendingOrder()
	
	{
		Collections.sort(al);
		
		Collections.reverse(al);
		
		System.out.println("-------------------------------------");
		
		System.out.println("Before modification");
		
		
		System.out.println(al);
		
		System.out.println("The descending order of array list");
		
		System.out.println(al);
		
		
		}
	
	public void ascendingOrder()
	
	
	{
		System.out.println("----------------------------");
		
		System.out.println("After sorting an array");
		
		Collections.sort(al);
		
		System.out.println(al);
	}
	
	public void addElementUsingListIterator()
	
	{
		
		ListIterator lir =al.listIterator();
		
		System.out.println("----------------------------------------");
		
		System.out.println("After adding the element by using list iterator");
		
		lir.add(10);
		
		System.out.println(al);
		
	}
	
	public void operation()
	
	{
		al.set(1,200);
		
		System.out.println("---------------------------------");
		
		System.out.println("After replacing an element:"+al);
		
		System.out.println("----------------------------------------");
		
		System.out.println("The element is present or not: "+al.contains(100));
		
		System.out.println(" To get 0 index value: "+al.get(0));
		
		System.out.println("---------------------------------------");
		
		al.remove(5);
		
		System.out.println("To remove element from an array list"+al);
		
	}
	public void removeDuplicate()
	
	{
		
		al.add(50);
		
		al.add(100);
		
		al.add(60);
		
		al.add(10);
		
		al.add(50);
		
		System.out.println("-------------------------------------");
		
		System.out.println("With duplicate elements ");
		
		System.out.println(al);
		
		ArrayList al4 = new ArrayList();
		
		for(int i=0;i<al.size();i++)
			
		{
			int count=0;
			
			for(int j=0;j<al.size();j++)
				
			{
				if(al.get(i)==al.get(j))
					
				{
					count++;
				}
			}
			
			if(count==1)
				
			{
				al4.add(al.get(i));
			}
		}
		
		System.out.println("After removing duplicate elements");
		
		System.out.println(al4);
	}
	
	
}
