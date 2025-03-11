package Collections;

import java.util.HashMap;

public class WordsWithEvenCount {

	public static void main(String[] args) {
		
		String sentence = "qwerty qwre qwerty qre qwerty qre qwre";
		String[] arr = sentence.split(" ");
		String words = "words with even count are ";
		
		HashMap<String, Integer> example = new HashMap<>();
		for(String str:arr) {
			if(example.containsKey(str)) {
				int count = example.get(str);
				example.put(str, count+1);
			}
			else {
				example.put(str, 1);
			}
		}
		
		for(String str:example.keySet()) {
			int count = example.get(str);
			if(count%2==0) {
				words = words+str+" ";
			}
		}
		System.out.println(words);

	}

}
