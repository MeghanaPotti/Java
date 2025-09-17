package Collections;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		
		String a = "listen";
		String b = "silent";
		
		if(isAnagram(a, b)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
		
	}
	
	public static boolean isAnagram(String a, String b) {
		
		if(a.length()!=b.length()) {
			return false;
		}
		
		HashMap<Character, Integer> example = new HashMap<>();
		for(char ch : a.toCharArray()) {
			int count = example.getOrDefault(ch, 0);
			example.put(ch, count+1);
		}
		
		for(char ch : b.toCharArray()) {
			if(!example.containsKey(ch))
				return false;
			int count = example.get(ch);
			example.put(ch, count-1);
			if(example.get(ch)==0)
				example.remove(ch);
		}
		return example.isEmpty();
	}
	

}

//Arrays.sort(a1);
//Arrays.sort(b1);
//
//if(Arrays.equals(a1, b1)) {
//	System.out.println(a+", "+b+" are anagram");
//}
//else {
//	System.out.println("Not an anagram");
//}

//js

//function isAnagram(a, b) {
//    if (a.length !== b.length) return false;
//
//    const charCount = new Map();
//
//    for (let ch of a) {
//        charCount.set(ch, (charCount.get(ch) || 0) + 1);
//    }
//
//    for (let ch of b) {
//        if (!charCount.has(ch)) return false;
//        charCount.set(ch, charCount.get(ch) - 1);
//        if (charCount.get(ch) === 0) charCount.delete(ch);
//    }
//
//    return charCount.size === 0;
//}