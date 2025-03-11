package Collections;

public class StringExpansion {

	public static void main(String[] args) {
		
		String input = "a3b1c3a2";
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			if(Character.isLetter(input.charAt(i))) {
				int count = Character.getNumericValue(input.charAt(i+1));
				for(int j=0;j<count;j++) {
					output = output+input.charAt(i);
				}
			}
		}
		System.out.println(input+" expansion is "+output);

	}

}

