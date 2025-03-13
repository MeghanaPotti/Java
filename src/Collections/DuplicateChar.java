package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.lang.model.element.Element;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name = "meghana";
//		char[] arr = name.toCharArray();
		HashSet<Character> example = new HashSet<>();   //for printing unique character
		for(int i=0;i<name.length();i++) {
//			boolean elementAdded = example.add(name.charAt(i));
//			
//			if(elementAdded==false) {   //false for duplicated characters
//				System.out.print(name.charAt(i)+" ");
//			}
//			
			//or
			
//			if(example.add(name.charAt(i))) {
//				
//			}
//			else {
//				System.out.print(name.charAt(i)+" ");
//			}
					
			if(example.contains(name.charAt(i))) {
				System.out.print(name.charAt(i)+" ");
			}
			else {
				example.add(name.charAt(i));
			}
		}
		System.out.println();
		for(char ch: example) {
			System.out.print(ch+" "); //why in alphabetical order?
		}
		 
//		HashMap<Character, Integer> example = new HashMap<>();  //for count
//		for(char ch: arr) {
//			if(example.containsKey(ch)) {
//				int count = example.get(ch);
//				example.put(ch, count+1);
//			}
//			else {
//				example.put(ch, 1);
//			}
//		}
//		
//		for(char ch:example.keySet()) {
//			int count = example.get(ch);
//			if(count>1) {
//				System.out.println("Duplicated characters are "+ch);
//			}
//		}
		
		
		
	}

}
