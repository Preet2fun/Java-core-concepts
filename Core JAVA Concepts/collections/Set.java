package collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
         // HashSet, TreeSet and LinkedHashSet classes implements Set interface
	    // thses classes does not accepts duplicate values
        // there is no guarantee that element will get stored in sequentail order
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add(null);
		hs.add("INDIA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs.size());
		System.out.println(hs);
		

	}

}
