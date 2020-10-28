package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set collections
		Set<String> fruit = new HashSet<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Apple");
		
		System.out.println("############ SET #################");
		Iterator<String> i = fruit.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String name : fruit) {
			System.out.println(name);
		}
		
		// below iteration methods works for List and queue also
		System.out.println("############ SET #################");
		
		System.out.println(fruit.contains("Apple"));
		System.out.println(fruit.size());
		System.out.println(fruit);
		
		//list collections
		List<String> team = new ArrayList<String>();
		team.add("MANU");
		team.add("LIV");
		team.add("RM");
		team.add("MANU");
		
		System.out.println(team.contains("Apple"));
		System.out.println(team.size());
		System.out.println(team);
		
		//queue
		
		Queue<String> people = new LinkedList<String>();
		people.add("AA");
		people.add("BB");
		people.add("CC");
		people.add("AA");
		
		
		System.out.println(people.contains("Apple"));
		System.out.println(people.size());
		System.out.println(people);
		
		//MAP
		
		Map<Integer,String> score=new HashMap<Integer,String>();
		score.put(101, "Rohit");
		System.out.println(score.containsValue("Rohit"));
		score.put(201, "Kholi");
		score.put(101, "Pandya");
		score.put(20, "Bhumra");
		
		System.out.println("############ MAP #################");
		for (Entry<Integer, String> name : score.entrySet()) {
			System.out.println(name.getValue());
		}
		
		score.forEach((k,v) -> System.out.println("key : " + k + " Value : " + v));
		
		System.out.println("############ MAP #################");
		System.out.println(score.containsValue("Rohit"));
		System.out.println(score.size());
		System.out.println(score.values());
		System.out.println(score.keySet());
		System.out.println(score.get(201));
	}

}
