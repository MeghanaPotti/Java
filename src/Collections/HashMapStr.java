package Collections;

import java.util.HashMap;

public class HashMapStr {

	public static void main(String[] args) {
		
		String sentence = "mag meg mig meg";
		String[] arr = sentence.split(" ");
		HashMap<String, Integer> example = new HashMap<>();
		for(String ch:arr) {
			if(example.containsKey(ch)) {
				int count = example.get(ch);
				example.put(ch, count+1);
			}
			else {
				example.put(ch, 1);
			}
		}
		for(String ch:example.keySet()) {
			int count = example.get(ch);
			System.out.println(ch+"="+count+"times");
		}
		
		
	}
}
