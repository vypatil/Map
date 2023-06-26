package map.pro.identityhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {

	
	public static void main(String[] args) {
		
		
		Bike b1 = new Bike("ninja",100);
		Bike b2 = new Bike("ktm",200);
		Bike b3 = new Bike("bajaj",300);
		Bike b4 = new Bike("bajaj",300);
		
		HashMap<Bike, Integer> hm = new HashMap<>();
		
		hm.put(b1,1111);
		hm.put(b2,1212);
		hm.put(b3,1313);
		hm.put(b4,1313);
		
		
		Set<Map.Entry<Bike, Integer>> s1 = hm.entrySet();
		
		Iterator<Map.Entry<Bike, Integer>> itr = s1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}
}
