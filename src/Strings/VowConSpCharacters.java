package Strings;

public class VowConSpCharacters {

	public static void main(String[] args) {
		
		String name = "qwert!@#aivec";
		int vowelsCount = 0, consCount = 0, spCount = 0;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				vowelsCount++;
				System.out.println("vowels are "+name.charAt(i));
				System.out.println("vowels count are "+vowelsCount);
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
				consCount++;
				System.out.println("Consonants are "+name.charAt(i));
				System.out.println("Consonants count are "+consCount);
			}
			else {
				spCount++;
				System.out.println("Special characters are "+name.charAt(i));
				System.out.println("Special characters are "+spCount);
			}
		}

	}

}
