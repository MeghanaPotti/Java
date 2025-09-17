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


//js

//function removeAllDuplicateWords(sentence) {
// const words = sentence.split(" ");
// const wordCount = new Map();
//
// for (let word of words) {
//     wordCount.set(word, (wordCount.get(word) || 0) + 1);
// }
//
// for (let [word, count] of wordCount.entries()) {
//     if (count > 1) {
//         const regex = new RegExp(`\\b${word}\\b`, "g");
//         sentence = sentence.replace(regex, '');
//     }
// }
//
// sentence = sentence.replace(/\s+/g, ' ').trim();
// console.log(sentence);
// return sentence;
//}
