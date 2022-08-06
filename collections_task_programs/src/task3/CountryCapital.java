package task3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryCapital {
	
	HashMap<String ,String> countries = new HashMap();
	
	public void country()
	{
		countries.put("India", "NewDelhi");
		countries.put("Bangladesh", "Dhaka");
		countries.put("Australis", "Conberra");
	}
	public void entrySetWithIterator()
	{
		Set set = countries.entrySet();
		Iterator itr = set.iterator();
		System.out.println("EntrySet with Iterator");
		System.out.println("---------------------------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}
	public void entrySetWithForeach()
	{
		System.out.println("Entry set with forEach");
		System.out.println("---------------------------------");
		for(Map.Entry<String, String> entry : countries.entrySet())
		{
			System.out.println("Key="+entry.getKey()+"Value="+entry.getValue());
		}
		System.out.println();
	}
	public void keySetiterator()
	{
		
		System.out.println(" Using Keys set iterator");
		System.out.println("-------------------------------");
		for( String key :countries.keySet())
		{
			System.out.println(key+":"+countries.get(key));
		}
		System.out.println();
	}
	public void value()
	{
		System.out.println("The values are ");
		for(String value:countries.values())
		{
			System.out.println(value);
		}
		System.out.println();
	}
	public void forEach()
	{
		System.out.println("------------------------------------");
		System.out.println("Using For each loop");
		countries.forEach((k,v) -> System.out.println("Country = "
                + k + "- Capital = " + v));
		System.out.println();
          
	}
	

}
