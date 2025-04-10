package Strings;

public class SecondOccuranceReplace {

	public static void main(String[] args) {

		String input = "tomorrow";
		char target = 'o';
		int count = 0;
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i)==target) {
				count++;
				if(count==2) {
					output = output+'$';
					continue;
				}
			}
			output = output+input.charAt(i);
		}
			System.out.println(output);
	}

}
