package task9;

import java.util.HashMap;
import java.util.Map;

public class DisplaySortMapValue {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Food", 50);
		hm.put("Flowers",60);
		hm.put("Fruits", 20);
		hm.put("Ball",10);
		hm.put("Bat", 40);
		
		System.out.println("Before sorting");
		System.out.println(hm);
		System.out.println();
		
		Map<String,Integer> hm1 =SortMapValue.sortByValue(hm);
		
		
		System.out.println("---------------------------------");
		
		System.out.println("After Sorting");
		
		for(Map.Entry<String, Integer> entry : hm1.entrySet())
		{
	
			System.out.println("Keys="+entry.getKey()+",  values="+entry.getValue());
		}
	}
}
