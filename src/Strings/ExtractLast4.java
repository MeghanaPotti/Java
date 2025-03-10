package Strings;

public class ExtractLast4 {

	public static void main(String[] args) {
		
		String name = "Meghana";
		String name1 = name.toLowerCase();
		
		for(int i=name1.length()-4; i<name1.length();i++) {
			System.out.print(name1.charAt(i));
		}

	}

}
