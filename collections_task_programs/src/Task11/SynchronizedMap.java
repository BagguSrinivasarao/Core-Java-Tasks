package Task11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
	
	public static void main(String[] args) {
		
		Map hm = new HashMap();
		
		try {
			
		hm.put(1, "fruits");
		
		hm.put(2, "flowers");
		
		hm.put(3, "vegetables");
		
		hm.put(4, "breads");
		
		Map map = Collections.synchronizedMap(hm);
		
		synchronized(map)
		{
		
		System.out.println(map);
		
		}
		
	   }
		 catch (IllegalArgumentException e) {
			  
	            System.out.println("Exception thrown : " + e);
	        }
	}
	}


