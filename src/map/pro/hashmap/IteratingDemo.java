package map.pro.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("a", 10);
		hm.put("b", 20);
		hm.put(null, null);
		hm.put(null, 30);
		hm.put("c", 40);
		hm.put("d", 40);
		hm.put("e", null);

		Set<String> obj = hm.keySet();

		Iterator<String> itr = obj.iterator();

		System.out.println("Iterating by keyset() with Iterator : ");

		while(itr.hasNext()) {

			String key = itr.next();
			System.out.println(key + " ---> " + hm.get(key));
		}

		HashMap<Long, Character> hm2 = new HashMap<>();

		hm2.put(1122l, 'a');
		hm2.put(null, 'b');
		hm2.put(null, null);
		hm2.put(1133l, 'c');
		hm2.put(1144l, 'd');
		hm2.put(1155l, 'e');

		System.out.println("Iterating by entryset() with Iterator : ");

		Set<Map.Entry<Long, Character>> obj2 = hm2.entrySet();

		Iterator<Map.Entry<Long, Character>> itr2 = obj2.iterator();

		while(itr2.hasNext()) {

			Map.Entry<Long, Character> e = itr2.next();

			System.out.println(e.getKey() +" ---> " + e.getValue());
		}
	}
}
