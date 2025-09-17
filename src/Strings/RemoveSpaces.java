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


//js

//const removeSpacesAndSpecialChars = () => {
//	  const sentence = "qwr asf qwr";
//	  const s1 = sentence.replace(/\s/g, '');
//	  console.log("Removing spaces");
//	  console.log(s1);
//
//	  const name = "@@dfgh@";
//	  const n1 = name.replace(/@/g, '');
//	  console.log("Removing special characters");
//	  console.log(n1);
//	};
//
//	removeSpacesAndSpecialChars();
