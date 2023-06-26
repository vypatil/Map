package map.pro.hashtable;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiseDemo {

	public static void main(String[] args) {

		Properties p1 = new Properties();
		
		p1.setProperty("a", "java");
		p1.setProperty("b", "pro");
		p1.setProperty("c", "dev");
		p1.setProperty("d", "wings");

		System.out.println(p1);
		
		System.out.println(p1.getProperty("d"));
		
		System.out.println(p1.getProperty("c", "dev"));
		
		
		System.out.println("print only values ---> by elements().");
		Enumeration e = p1.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
		System.out.println("print only keys ----> by keys().");
		Enumeration e2 = p1.keys();
		
		while(e2.hasMoreElements()) {
			
			System.out.println(e2.nextElement());
		}
	}

}
