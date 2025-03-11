package Collections;

import java.util.HashMap;

public class HashMapChar {

	public static void main(String[] args) {
		
		String word = "qwerasqecaeftgrqewt";
		char[] arr = word.toCharArray();
		HashMap<Character, Integer> example = new HashMap<>();
		
		for(char ch:arr) {
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
			System.out.print(ch+""+count);
		}
	}

}
