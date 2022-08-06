package task10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SerialzationHashMap {
	
public static void main(String[] args) {
	
	HashMap<String,String> cricket = new HashMap();
	
	cricket.put("Bowler", "Bumrah");
	
	cricket.put("Batsman","Sachin" );
	
	cricket.put("Captain","MSD" );
	
	cricket.put("AllRounder","Jadeja" );
	
	try {
		
	FileOutputStream myfile = new  FileOutputStream("D:\\srinu_core_java\\serializationmap\\map.txt");
	
	ObjectOutputStream myObject = new ObjectOutputStream (myfile);
	
	myObject.writeObject(cricket);
	
	myObject.close();
	
	myfile.close();
	
	System.out.println("file created");
	
	}
	
	catch(IOException e)
	
	{
		e.printStackTrace();
	}
	
}
}
