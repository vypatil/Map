package map.pro.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		
		lm.put("a", 10);
		lm.put("b", 20);
		lm.put(null, 30);
		lm.put(null, 80);
		lm.put("a", 10);
		lm.put("c", 40);
		lm.put("d", null);
		lm.put("e", null);
		
		Set<String> obj = lm.keySet();
		
		Iterator<String> itr = obj.iterator();
		
		for(String s : obj) {
			
//			System.out.println(s);
			String value = itr.next();
			
			System.out.println(value + "----> " + lm.get(value));
		}
		
	}
}
