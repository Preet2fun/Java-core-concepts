package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
	
		// Array has fixed length where as ArrayList length grows daynamically  
		// all the classes (ArrayList, LinkedList and Vector) which implement List interface will accept duplicate values
		// You can access and insert any value at any index
		
		
		ArrayList<String> arrayList = new ArrayList<String>(); 
		
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.size());
		arrayList.add("I Love");
		arrayList.add("Football");
		arrayList.add("Football");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("football"));
		System.out.println(arrayList.contains("Football"));
		
		for (String element:arrayList) {
			
			System.out.println(element);
		}
		
		// Iterator - it is the interface
		
		Iterator<String> i = arrayList.iterator();
		
		
		while(i.hasNext()) {
		System.out.println(i.next());
	       }
		
		//System.out.println(i.next());
		//System.out.println(i.next());
		
	}
}
