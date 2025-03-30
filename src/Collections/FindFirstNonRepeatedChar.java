package Collections;

import java.util.HashMap;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String name = "eaafcbbdccs";
		char[] arr = name.toCharArray();
		
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
		
		for(char ch: arr) {   
			int count = example.get(ch);
			if(count==1) {
				System.out.println("First non repeated charcater is "+ch);
				break;
			}
		}

	}

}
