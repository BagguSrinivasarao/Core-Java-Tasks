package task17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMedal {
	
	HashMap<String,Integer> marks2 = new HashMap();
	
	public void studentmarks2()
	
	{
		marks2.put("18NR5A0201", 90);
		
		marks2.put("18NR5A0202", 85);
		
		marks2.put("18NR5A0203", 76);
		
		marks2.put("18NR5A0204", 80);
		
		marks2.put("18NR5A0205", 60);
		
		marks2.put("18NR5A0206", 77);
		
		marks2.put("18NR5A0207", 95);
		
		marks2.put("18NR5A0208", 83);
	}
	
	public void studentInfo()
	
	{
		Set set = marks2.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
			
		{
			Map.Entry entry2 = (Map.Entry) itr.next();
			
			Integer marks = (Integer) entry2.getValue();
			
			if(marks>=90)
			{
			  System.out.println("Student Regestration number:"+entry2.getKey()+"  Medal: Gold");
				
			}
			
			else if(marks>=80&&marks<90)
			{
				System.out.println("Student Regestration number:"+entry2.getKey()+"  Medal: Silver");
			}
			
			else if(marks>70&&marks<80)
			{
				
				System.out.println("Student Regestration number:"+entry2.getKey()+"  Medal: Bronze");
			}
			
			
		}
	}

}
