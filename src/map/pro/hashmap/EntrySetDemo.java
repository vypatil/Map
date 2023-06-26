package map.pro.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", null);
		hm.put("d", 400);
		hm.put("e", 500);
		hm.put(null, 800);
		hm.put(null, 500);

		Set<Map.Entry<String, Integer>> obj = hm.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr = obj.iterator();
		
		System.out.println("Iterating on entry set : ");
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}
}
