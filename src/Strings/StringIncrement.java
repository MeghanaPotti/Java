package Strings;

public class StringIncrement {

	public static void main(String[] args) {
		
		String input = "abcd";
		String output = "";
		
		for(int i=0; i<input.length();i++) {
			
			output = output+input.charAt(i)+input.charAt(i);
		}

		System.out.println(output);
	}

}
