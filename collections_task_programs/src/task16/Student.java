package task16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
	
	HashMap marks = new HashMap();
	
	public void studentsMarks()
	{
	
    marks.put("Raghu",67);
    
    marks.put("Rama",50);
    
    marks.put("Sundar",58);
    
    marks.put("Somash", 80);
    
    marks.put("Pawan", 90);
    
    marks.put("bala",40);
    
    
	}
	
    public void marksresult()
    {
    	
    	Set set = marks.entrySet();
    	
    	Iterator itr = set.iterator();
    	
    	while (itr.hasNext()) {
    		
          Map.Entry entry = (Map.Entry)itr.next();
          
         Integer i = (Integer) entry.getValue();
         
         
            
               if(i>60)
            {
	           System.out.println(entry.getKey()+"  : Pass"); 
            }
               else {
            	   System.out.println(entry.getKey()+"  :Fail");
               }
            
    	}
    }
    
    	
    
    }
   



