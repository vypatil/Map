package map.pro.treemap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("z", 88);
		tm.put("v", 52);
		tm.put("e", 30);
		tm.put("a", 10);
		
		System.out.println(tm);
		
		Set<Map.Entry<String, Integer>> obj = tm.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr = obj.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		Collection<String> obj2 = tm.keySet();
		
		Iterator<String> itr2 = obj2.iterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(itr2.next());
			
			String s = itr2.next();
			
			System.out.println(s + tm.get(s));
		}
		
		
		Collection<Integer> c = tm.values();
		
		Iterator<Integer> itr3 = c.iterator();
		
		while(itr3.hasNext()) {
			
			System.out.println();
		}
	}
}
