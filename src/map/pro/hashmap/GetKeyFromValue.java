package map.pro.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetKeyFromValue {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("vaibhav",34);
		hm.put("rushi",87);
		hm.put("sush",11);
		hm.put("pratik",23 );

		System.out.println("Hashmap : " + hm);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		Integer value = sc.nextInt();

		for(Map.Entry<String,Integer> obj : hm.entrySet()) {

			if(obj.getValue() == value) { 
				if(true) 
					System.out.println(value +"---"+ obj.getKey());
				
				else
					System.out.print(value +"notfound");
				
				
			}
			
			
			

		}

	}


}
