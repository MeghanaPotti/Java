package Collections;

import java.util.HashMap;

public class RemoveAllDuplicateWords {

	public static void main(String[] args) {
		
		String sentence = "qwer qtiglo qwer qeroj qtiglo";
		String[] arr = sentence.split(" ");
		
		HashMap<String, Integer> example = new HashMap<>();
		for(String str : arr) {
			if(example.containsKey(str)) {
				int count = example.get(str);
				example.put(str, count+1);
			}
			else {
				example.put(str, 1);
			}
		}
		for(String str : example.keySet()) {
			int count = example.get(str);
			if(count>1) {
				sentence = sentence.replace(String.valueOf(str), "");
			}
		}
		System.out.println(sentence.trim()); 
	}

}
