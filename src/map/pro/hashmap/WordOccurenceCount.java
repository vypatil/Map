package map.pro.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class WordOccurenceCount {

	public static void main(String[] args) {

		String line = "java is robust as well as secure language words";
		
		String[] arr = line.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		HashMap<String, Integer> obj = new HashMap<>();
		
		for(String s : arr) {
			
			Integer oldcount = obj.get(s);
			
			if(oldcount == null) {
				
				obj.put(s, 1);
			}
			else {
				
				obj.put(s, oldcount+1);
			}
		}
		for(String k : obj.keySet()) {
			
			System.out.println(k + " : " + obj.get(k));
		}
		
	}

}
