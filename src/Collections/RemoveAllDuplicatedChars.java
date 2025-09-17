package Collections;

import java.util.HashMap;

public class RemoveAllDuplicatedChars {

	public static void main(String[] args) {
	
		String name = "qqweaafqcc";
		char[] arr = name.toCharArray();
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
			if(count>1) {
				name = name.replaceAll(String.valueOf(ch), "");
			}
		}
		System.out.println("String after removing duplicates "+name);
	}

}


//js

//function removeAllDuplicatedChars(str) {
// const charCount = new Map();
//
// for (let ch of str) {
//     charCount.set(ch, (charCount.get(ch) || 0) + 1);
// }
//
// for (let [ch, count] of charCount.entries()) {
//     if (count > 1) {
//         str = str.split(ch).join('');
//     }
// }
//
// console.log("String after removing duplicates:", str);
// return str;
//}
