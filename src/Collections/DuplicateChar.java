package Collections;

import java.util.HashSet;
import java.util.Set;

import javax.lang.model.element.Element;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name = "meghana";
		HashSet<Character> example = new HashSet<>();   //HashSet for printing unique character and HashMap for count
		for(int i=0;i<name.length();i++) {
			boolean elementAdded = example.add(name.charAt(i));
			
			if(elementAdded==false) {   //false for duplicated characters, true for unique characters
				System.out.print(name.charAt(i)+" ");
			}
			
			//or
			
//			if(example.add(name.charAt(i))) {
//				
//			}
//			else {
//				System.out.print(name.charAt(i)+" ");
//			}
					
		}
		
	}

}
