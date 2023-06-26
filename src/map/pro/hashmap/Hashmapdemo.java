package map.pro.hashmap;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", null);
		hm.put("d", 400);
		hm.put("e", 500);
		hm.put(null, 800);
		hm.put(null, 500);

		System.out.println(hm.isEmpty());
		
		System.out.println(hm.size());
		
		System.out.println(hm.get("c"));
		
		System.out.println(hm.containsKey(null));
		
		System.out.println(hm.containsValue(500));
		
		System.out.println(hm.remove("a"));
		
		System.out.println(hm);

		HashMap<String, Integer> hm2 = new HashMap<>();
		
		hm2.putAll(hm);
		
		System.out.println(hm2.isEmpty());
		System.out.println(hm2);
	}

}
