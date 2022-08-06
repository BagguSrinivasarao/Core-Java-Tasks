package task8;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapIteration {
	
public static void main(String[] args) {
	
	Map<String,String> flowers= new TreeMap<>();
	
	flowers.put("Rose", "Pink");
	
	flowers.put("Jasmine", "yellow");
	
	flowers.put("lilly", "white");
	
	Iterator itr = flowers.entrySet().iterator();
	
	
	while(itr.hasNext())
		
	{
		Map.Entry entry= (Map.Entry)itr.next();
		
		System.out.println("Keys: "+entry.getKey()+"  Values: "+entry.getValue());
		
	}
}
}
