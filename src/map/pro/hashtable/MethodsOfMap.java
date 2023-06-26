package map.pro.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MethodsOfMap {

	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new Hashtable<>();
		
		m1.put("a", 10);
		m1.put("b", 20);
		m1.put("c", 30);
		m1.put("d", 40);
		m1.put("e", 50);
		
		Map<String,Integer> m2 = new Hashtable<>();
		
		m2.put("f", 60);
		m2.put("g", 70);
		m2.put("h", 80);
		m2.put("i", 90);
		m2.put("j", 100);
		
		m1.putAll(m2);
		
		System.out.println(m1.containsKey("x"));
		
		System.out.println(m2.containsValue(90));
		
		System.out.println("m1 map having this keys --> "+m1.keySet());
		
		System.out.println("m2 map having this values --> "+m2.values());
		
		System.out.println(m2.entrySet());
		
		System.out.println(m1.get("c"));
		
		System.out.println(m2.size());
		
		System.out.println(m1.isEmpty());
		
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.hashCode());
		
		System.out.println(m2.hashCode());
		
		System.out.println(m2.remove("j", 100));
		
		System.out.println(m1);
	}
}
