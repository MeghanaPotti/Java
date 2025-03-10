package Strings;

public class PalindromeOfAString {

	public static void main(String[] args) {
		
		String name = "MOA";
		name = "qwerty";
		String temp = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		
		if(temp.equals(name)) {
			System.out.println(name+" is Palindrome String");
		}
		else {
			System.out.println(name+" is not a palindrome string");
		}

	}

}
