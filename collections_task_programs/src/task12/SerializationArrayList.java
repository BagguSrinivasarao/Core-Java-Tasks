package task12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationArrayList {
	
public static void main(String[] args) {
	
	SerializationArrayList sal = new SerializationArrayList();
	sal.serializedlist();
	

}

public void serializedlist()
{
	List list = new ArrayList();
	
	list.add(500);
	list.add(600);
	list.add(100);
	list.add(200);
	list.add(300);
	  
	try {
		
	FileOutputStream myfile1 = new FileOutputStream("D:\\srinu_core_java\\list.txt");
	
	ObjectOutputStream outputObject1 = new  ObjectOutputStream(myfile1);
	
	outputObject1.writeObject(list);
	
	outputObject1.close();
	
	myfile1.close();
	
	System.out.println("File created");
	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
}
}
