package task12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializationArrayList {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> al1 =new ArrayList<String>();

	try {
		
		FileInputStream fin = new FileInputStream("D:\\srinu_core_java\\list.txt");
		
		ObjectInputStream ois = new ObjectInputStream (fin);
		
		al1=(ArrayList)ois.readObject();
		
		ois.close();
		
		fin.close();
		
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
		
		return;
	}
	
	catch(ClassNotFoundException c)
	{
		System.out.println("CalssNotFound");
		
		c.printStackTrace();
		
		return;
	}
	
   for(Object o:al1)
	   
   {
	   System.out.println(o);
   }
}

}
