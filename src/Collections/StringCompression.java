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


//js

//const stringCompression = (input) => {
//	  const charCount = new Map();
//
//	  for (const ch of input) {
//	    charCount.set(ch, (charCount.get(ch) || 0) + 1);
//	  }
//
//	  let compressed = '';
//	  for (const [char, count] of charCount) {
//	    compressed += `${char}${count}`;
//	  }
//
//	  return compressed;
//	};
//
//	const input = "aabbbcccc";
//	console.log(stringCompression(input));
