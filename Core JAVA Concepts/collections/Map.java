package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("0", "My");
		hm.put("1", "Name");
		hm.put("2", "is");
		hm.put("3", "Pratik");
		hm.put("4", " ");
		System.out.println(hm.size());
		System.out.println(hm.get("3"));
		
		java.util.Set<Entry<String, String>> sn = hm.entrySet();
		Iterator<Entry<String, String>> it = sn.iterator();
		
		
		while(it.hasNext()) {
		Entry<String, String> mp = it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
		
		//The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. 
		//It basically returns a set view of the hash map or we can create a new set and store the map elements into them.
		
		// Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, "Geeks"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "Geeks"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Using entrySet() to get the set view 
        System.out.println("The set is: " + hash_map.entrySet()); 
        
        
        //difference between hashmap and hashtable
        //1) Hashmap is non-synchronized and not a thread-safe where as Hashtable is syncrhonized and thread-safe
        //2) Hashmap is using null as key and value but hashtable not allowed it
        //3) Hashmap use iterator object to iterate for values where as hashtable is enumerator object
        
        // Creating an empty Hashtabe 
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>(); 
        
        hash_table.put(10, "Geeks"); 
        hash_table.put(15, "4"); 
        hash_table.put(20, "Geeks"); 
        hash_table.put(25, "Welcomes"); 
        //hash_table.put(null, null); 
        
     // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_table); 
		

	}

}
