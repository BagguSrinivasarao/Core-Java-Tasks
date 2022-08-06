package task_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {
	
	public static void main(String[] args) {
		
		List<Object> list =Collections.synchronizedList(new ArrayList<>());
		
		list.add(50);
		
		list.add(100);
		
		list.add(10);
		
		list.add(30);
		
	
		
		synchronized(list)
		
		{
			Iterator itr = list.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
	}

}
