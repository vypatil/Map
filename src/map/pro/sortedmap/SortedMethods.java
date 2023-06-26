
package map.pro.sortedmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMethods {
		
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("aa", 555);
		tm.put("dd", 111);
		tm.put("xx", 666);
		tm.put("yy", 999);
		tm.put("kk", 555);
		tm.put("kk", null);
		tm.put("ww", null);
		
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
		System.out.println(tm.headMap("kk"));
		
		System.out.println(tm.tailMap("kk"));
		
		System.out.println(tm.subMap("dd", "xx"));
	}
}
