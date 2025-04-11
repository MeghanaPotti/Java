package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		
		String input = "aabbbcccc";
		Map<Character, Integer> example = new LinkedHashMap<>();
		
		for(char ch : input.toCharArray()) {
			if(example.containsKey(ch)) {
				int count = example.get(ch);
				example.put(ch, count+1);
			}
			else {
				example.put(ch, 1);
			}
		}
		for(char ch : example.keySet()) {
			System.out.print(ch+""+example.get(ch));
		}
	}

}
