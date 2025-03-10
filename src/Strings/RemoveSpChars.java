package Strings;

public class RemoveSpChars {

	public static void main(String[] args) {
		
		String name = "!@#$$%avucu@";
		String replaced = name.replaceAll("[^a-z0-9A-Z]", "");
		System.out.println(replaced);
		

	}

}
