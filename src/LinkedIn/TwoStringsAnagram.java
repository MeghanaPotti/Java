package LinkedIn;

import java.util.Arrays;

public class TwoStringsAnagram {

	public static void main(String[] args) {
		
		String a = "silent";
		String b = "listen";
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1)) {
			System.out.println(a+", "+b+" are anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
	}

}
