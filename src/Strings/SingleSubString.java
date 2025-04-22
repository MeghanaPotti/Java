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
		for(int i=0;i<=chars.length-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(chars[j]);
			}
			System.out.println();
		}
	}

}
