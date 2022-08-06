package task10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeserializedhashMap {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		try {
		
		FileInputStream fin = new FileInputStream("D:\\srinu_core_java\\serializationmap\\map.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
	      hm = (HashMap) objin.readObject();
		
		objin.close();
		
		fin.close();
		
		
		}
		catch(IOException e )
		{
			e.printStackTrace();
			
			return;
		}
		
		catch(ClassNotFoundException c)
		
		{
			c.printStackTrace();
			
			return;
		}
		
		Set set = hm.entrySet();
		
		Iterator iterator = set.iterator();
		  
        while (iterator.hasNext()) {
        	
            Map.Entry entry = (Map.Entry)iterator.next();
  
            System.out.print("key : " + entry.getKey() + " & Value : ");
            
            System.out.println(entry.getValue());
        }
		
	
	}
	
}
