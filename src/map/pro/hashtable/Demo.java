package map.pro.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Demo {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> h = new Hashtable<>();
		
		h.put("a", 100);
		h.put("b", 200);
		h.put("c", 300);
		h.put("d", 300);
		h.put("e", 300);
		
		System.out.println(h.get("d"));
		
		System.out.println(h.remove("e", 300));
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.contains(500));
		
		System.out.println(h.size());
		
		
		System.out.println("traverse only values ---> by elements().");
		Enumeration e = h.elements();

		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
		System.out.println("traverse only keys ---> by keys().");
		Enumeration e2 = h.keys();
		
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
		
		System.out.println("print whole hashtable");
		System.out.println(h);
		

		
		
	}

}
