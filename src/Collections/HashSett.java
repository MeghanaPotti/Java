package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSett {

	public static void main(String[] args) {
		
		String word = "qweqeqrwrwfqre";
		Set<Character> example = new HashSet<>();
		System.out.println("Printing duplicate characters");
		for(int i=0;i<word.length();i++) {
			if(example.contains(word.charAt(i))) {
				System.out.print(word.charAt(i)+" ");
			}
			else {
				example.add(word.charAt(i));
			}
		}
			System.out.println();
			System.out.println("Printing unique charcaters");
			for(char ch:example) {	
				System.out.print(ch+" ");
			}
			
			System.out.println();
			
			//or
			
			String a = "asdfghsdfgsdf";
			HashSet<Character> ex = new HashSet<>();
			System.out.println("Duplicate charcaters");
			for(char ch : a.toCharArray()) {
				if(!ex.add(ch)) {
					System.out.print(ch+" ");
				}
			}
			System.out.println();
			System.out.println("Unique charcaters");
			for(char ch : ex) {
				System.out.print(ch+" ");
			}
	
		}
}
