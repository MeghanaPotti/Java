package Strings;

public class FirstAndLastIndex {

	public static void main(String[] args) {

		String a = "qertuywwqwrqqqqweqa";
		char target = 'q';
		
		int firstIndex = a.indexOf(target);
		int lastIndex = a.lastIndexOf(target);
		
		System.out.println("First occurance of "+target+" is at "+firstIndex);
		System.out.println("Last occurance of "+target+" is at "+lastIndex);

	}

}
