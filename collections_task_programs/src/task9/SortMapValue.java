package task9;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapValue {

	public static HashMap<String,Integer> sortByValue(HashMap<String,Integer>  hm)
	
	{
		
		List<Map.Entry<String, Integer>> list = new  LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
		
		HashMap<String,Integer> temp = new LinkedHashMap();
		
		for(Map.Entry<String, Integer> en : list)
			
		{
			temp.put(en.getKey(), en.getValue());
		}
		
		return temp;
	}
	
}
