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


//js

//const reverseEacconst reverseEachWord = (sentence) => {
//	  const words = sentence.split(' ');
//	  let reversedSentence = '';
//
//	  for (const word of words) {
//	    let reversedWord = '';
//	    for (let i = word.length - 1; i >= 0; i--) {
//	      reversedWord += word[i];
//	    }
//	    reversedSentence += reversedWord + ' ';
//	  }
//
//	  console.log(reversedSentence.trim());
//	};
//
//	const sentence = "qwer qwert qwerty";
//	reverseEachWord(sentence);

