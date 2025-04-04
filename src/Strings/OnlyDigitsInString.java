package Strings;

public class OnlyDigitsInString {

	public static void main(String[] args) {

		String a = "12345";
		
		if(a.matches("\\d+")) {                //\\d+ -  "one or more" occurrences, \\d* - allows an empty string as well ("zero or more").
			System.out.println("String contains only digits");
		}
		else {
			System.out.println("String contains extra characters");
		}

	}

}
