package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String sentence = "qwer qwert qwerty";
		String reversedSentence = "";
		String[] reverse = sentence.split(" "); 

		for(String s : reverse) {
		
			String reversedString = "";
			
			for(int i=s.length()-1;i>=0;i--) {
				reversedString = reversedString+s.charAt(i);
			}
			reversedSentence = reversedSentence+reversedString+" ";
		}
		System.out.println("After reversing each word in each sentence- "+reversedSentence);
	}

}

// reverse each word in the sentence
// reverse only words in the sentence(last word should be first)
// reverse each word and and sentence in the given sentence
// reverse of a string 