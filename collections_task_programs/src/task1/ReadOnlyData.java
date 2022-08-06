package task1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.TreeMap;

public class ReadOnlyData {
	
 public void list1()
{
		
 List al = new ArrayList();
 al.add("Techouts");
 al.add(100);
 al.add(50);
 al.add('Z');
 List l = Collections.unmodifiableList(al);
 //a1.remove(50);//here not possiible
 System.out.println(l);
   //a1.add(30); here not possible to add elements if you try to add you will get unSupported cast Exception

 }
 public void set()
 {
	Set hs = new HashSet();
	hs.add(100);
	hs.add(80);
	hs.add(null);
	hs.add("Techouts2");
	Set s = Collections.unmodifiableSet(hs);
	System.out.println(s);
 }
 public void map()
 {
	
	Map tr = new TreeMap();
	tr.put(1, "Techouts");
	tr.put(10, 100);
	tr.put(2, "Raja");
	
	Map m = Collections.unmodifiableMap(tr);
	System.out.println(m);
 }

}
