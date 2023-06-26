package map.pro.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		
		lm.put("a", 10);
		lm.put("b", 20);
		lm.put(null, 30);
		lm.put("a", 10);
		lm.put("c", 40);
		lm.put("d", null);
		lm.put("e", null);
		
		Set<Map.Entry<String, Integer>> obj = lm.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr = obj.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println(lm);
		
	}
}
