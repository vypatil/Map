package map.pro.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Bike b1 = new Bike("ninja",100);
		Bike b2 = new Bike("ktm",200);
		Bike b3 = new Bike("bajaj",300);
		Bike b4 = new Bike("bajaj",300);
		
		IdentityHashMap<Bike, Integer> obj = new IdentityHashMap<>();
		
		obj.put(b1, 1111);
		obj.put(b2, 1212);
		obj.put(b3, 1313);
		obj.put(b4, 1313);
		
		
		
		Set<Map.Entry<Bike, Integer>> s1 = obj.entrySet();
		Iterator<Map.Entry<Bike, Integer>> itr = s1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println(obj);
		
		
	}
}
