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


//js

//const wordsWithEvenCount = (sentence) => {
//	  const arr = sentence.split(' ');
//	  const wordCount = new Map();
//
//	  for (const word of arr) {
//	    wordCount.set(word, (wordCount.get(word) || 0) + 1);
//	  }
//
//	  let result = 'words with even count are ';
//	  for (const [word, count] of wordCount) {
//	    if (count % 2 === 0) {
//	      result += word + ' ';
//	    }
//	  }
//
//	  return result;
//	};
//
//	const sentence = "qwerty qwre qwerty qre qwerty qre qwre";
//	console.log(wordsWithEvenCount(sentence));

