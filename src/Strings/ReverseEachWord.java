package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String sentence = "qwer qwert qwerty";
		String[] reverse = sentence.split(" "); 
		String reversedSentence = "";		

		for(String s : reverse) {		
			String reversedString = "";			
			for(int i=s.length()-1;i>=0;i--) {
				reversedString = reversedString+s.charAt(i);
			}
			reversedSentence = reversedSentence+reversedString+" ";
		}
		System.out.println(reversedSentence);
	}

}


