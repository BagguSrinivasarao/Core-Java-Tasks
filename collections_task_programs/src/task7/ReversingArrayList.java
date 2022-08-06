package task7;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayList {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(50);
		
		al.add(30);
		
		al.add("Techouts");
		
		al.add('R');
		
		al.add(100.5);
		
		System.out.println("Before reversing an array");
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println("--------------------------------------");
		
		System.out.println("After reversing an array");
		
		System.out.println(al);
	}

}
