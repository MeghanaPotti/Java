package Strings;

public class ReverseSentenceAndWords {

	public static void main(String[] args) {		

		String sentence = "qwer qwert qwerty";
		String[] words = sentence.split(" "); 
		String reversedSentence = "";		
		
		for(int i=words.length-1;i>=0;i--) {
			String reversedWord = "";
			for(int j=words[i].length()-1;j>=0;j--) {
				reversedWord = reversedWord+words[i].charAt(j);
			}
			reversedSentence = reversedSentence+reversedWord+" ";
		}
		System.out.println(reversedSentence);
	}

}
