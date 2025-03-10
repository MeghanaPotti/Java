package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name = "meghana";
		char[] arr = name.toCharArray()
;//		HashSet<Character> example = new HashSet<>();
//		for(int i=0;i<name.length();i++) {
//			if(example.contains(name.charAt(i))) {
//				System.out.print(name.charAt(i)+" ");
//			}
//			else {
//				example.add(name.charAt(i));
//			}
//		}
//		System.out.println();
//		for(char ch: example) {
//			System.out.print(ch+" "); //why in alphabetical order?
//		}
		 
		HashMap<Character, Integer> example = new HashMap<>();
		for(char ch: arr) {
			if(example.containsKey(ch)) {
				int count = example.get(ch);
				example.put(ch, count+1);
			}
			else {
				example.put(ch, 1);
			}
		}
		
		for(char ch:example.keySet()) {
			int count = example.get(ch);
			if(count>1) {
				System.out.println("Duplicated characters are "+ch);
			}
		}
		
		
		
	}

}
