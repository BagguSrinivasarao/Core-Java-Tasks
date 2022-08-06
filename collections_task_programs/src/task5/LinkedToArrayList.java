package task5;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedToArrayList {
	
public static void main(String[] args) {
	
	LinkedList li = new LinkedList();
	
	li.add("Fruits");
	
	li.add("Flowers");
	
	li.add("Balls");
	
	li.add("Choclates");
	
	li.add(100);
	
	System.out.println("The Linked List elements are :"+li);
	
	System.out.println("--------------------------------------------------------------");
	
	ArrayList al = new ArrayList(li);
	
	System.out.println("The Array list elements are:"+al);
	
}

}
