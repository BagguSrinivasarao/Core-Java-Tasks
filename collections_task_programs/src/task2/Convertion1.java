package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convertion1 {

	public void arraylist()
	
	{
	Integer [] x = {10,40,30,20};
	
	String  [] s = {"Red","Green","Pink","Blue"};
	
	System.out.println("The arry elemnts are:");

	for(String z:s)
	{
		System.out.println(z);
	}
	// Method 1
	
	List al=Arrays.asList(s);
	
	System.out.println("The arrayList elements are: "+al);
	
	// Method 2
	
	List<String> al2 = new ArrayList<>();
	
	//Collections.addAll(al2, s);
	
	System.out.println("The arrayList Elements are:"+al2);
	
	List<Integer> al3 = new ArrayList();
	
	Collections.addAll(al3, x);
	
	System.out.println("The ArrayList elements are"+al3);
	
	//Method 3
	
	for(String s2:s)
	{
		al2.add(s2);
	}
	  System.out.println("The arrayList elements are:"+al2);
}

	  
	  //Convertion from Arraylist to Array
	
	  public void array()
	  
	  {
		  ArrayList<Integer> al = new ArrayList<>();
		  
		  al.add(2);
		  al.add(6);
		  al.add(8);
		  Object[] obj=al.toArray();
		  System.out.println("----------------------------------------------");
		  System.out.println("The array elements are");
		  for(Object obj2:obj)
		  {
		  System.out.println(obj2);
		  }
	  }
}

