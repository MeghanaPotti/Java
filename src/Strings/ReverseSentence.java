package Strings;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "qwer qwert qwerty";
		String[] reverse = sentence.split(" "); 
		String reversed = "";
		
		for(int i=reverse.length-1; i>=0; i--) {
			reversed = reversed+reverse[i]+" ";
		}
		System.out.println("Reversed sentence is "+reversed);
	}

}
