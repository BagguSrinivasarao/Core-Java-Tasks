package task6;

import java.util.HashSet;

public class HashSetToArray {
	
public static void main(String[] args) {
	
	HashSet<Integer> hs = new HashSet<>();
	
	hs.add(100);
	
	hs.add(50);
	
	hs.add(80);
	
	hs.add(20);
	
	hs.add(90);
	
	System.out.println("The hshset elements are:"+hs);
	
	Object[] obj = hs.toArray();
	
	System.out.println("-----------------------------------------");
	
	System.out.println("The array elements are");
	
	for(Object o:obj)
	{
		System.out.println(o);
	}
}
}
