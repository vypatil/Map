package map.pro.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingDemo3 {

	public static void main(String[] args) {

		HashMap<Long, Character> hm2 = new HashMap<>();

		hm2.put(1122l, 'a');
		hm2.put(null, 'b');
		hm2.put(null, null);
		hm2.put(1133l, 'c');
		hm2.put(1144l, 'd');
		hm2.put(1155l, 'e');
		
		System.out.println("Iterating by keyset() with for-each : ");
		
		Set<Long> mykey = hm2.keySet();
		
		for(Long l : mykey) {
			
			System.out.println(l + "---> " + hm2.get(l));
		}
		
		
		System.out.println("Iterating by Entryset() with for-each : ");
		
		Set<Map.Entry<Long, Character>> obj = hm2.entrySet();
		
		for(Map.Entry<Long, Character> e : obj) {
			
			System.out.println(e.getKey() + " ---> " + e.getValue());
		}
	}
}
