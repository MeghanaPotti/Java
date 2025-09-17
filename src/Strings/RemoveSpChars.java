package Strings;

public class RemoveSpChars {

	public static void main(String[] args) {
		
		String name = "!@#$$%avucu@";
		String replaced = name.replaceAll("[^a-z0-9A-Z]", "");
		System.out.println(replaced);
		

	}

}


//js

//const removeSpecialChars = (str) => {
//	  const replaced = str.replace(/[^a-zA-Z0-9]/g, '');
//	  console.log(replaced);
//	};
//
//	const name = "!@#$$%avucu@";
//	removeSpecialChars(name);
