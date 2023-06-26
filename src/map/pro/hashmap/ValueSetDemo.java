package map.pro.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ValueSetDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", null);
		hm.put("d", 400);
		hm.put("e", 500);
		hm.put(null, 800);
		hm.put(null, 500);

		Collection<Integer> obj = hm.values();
		
		Iterator<Integer> itr = obj.iterator();
		
		System.out.println("Iterating on values set : ");
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
