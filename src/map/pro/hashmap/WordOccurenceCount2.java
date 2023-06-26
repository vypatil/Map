package map.pro.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class WordOccurenceCount2 {

	public static void main(String[] args) {

		String s = "india is my country and india is big economy.";

		String [] words = s.split(" ");

		System.out.println(Arrays.toString(words));

		for(int i=0 ; i<words.length ; i++) {

			int count=0;

			for(int k=0 ; k<words.length ; k++) {

				if(words[i].equals(words[k])) {

					count++;

					if(count> 1) {
						words[k]="";
						break;
					}	
				}
			}
			if(! words[i].isEmpty()) {

				System.out.println(words[i] + ": " +count );
			}
		}

	}

}
