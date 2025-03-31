package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String sentence = "qwr asf qwr";
		String s1 = sentence.replaceAll("\\s", "");
		System.out.println("Removing spaces");
		System.out.println(s1);
		
		String name ="@@dfgh@";
		String n1 = name.replace("@", "");
		System.out.println("Removing special characters");
		System.out.println(n1); 

	}

}
