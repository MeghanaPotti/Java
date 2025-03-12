package Strings;

public class SingleSubString {

	public static void main(String[] args) {
		
		String name = "Keerthi";
		
		for(int i=1;i<=name.length();i++) {
			System.out.println(name.substring(0, i));
		}
		
		//or
		
		String names = "QWERTY";
		char[] chars = names.toCharArray();
		System.out.println("Printing left hand pyramid");
		for(int i=1;i<=chars.length;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(chars[k]);
			}
			System.out.println();
		}
	}

}
