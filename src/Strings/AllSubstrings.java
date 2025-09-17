package Strings;

public class AllSubstrings {

	public static void main(String[] args) {
		
		String name = "Keerthi";
		
		for(int i=0; i<name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				System.out.println(name.substring(i, j));
			}
		}

	}

}


//js

//const allSubstrings = (str) => {
//	  for (let i = 0; i < str.length; i++) {
//	    for (let j = i + 1; j <= str.length; j++) {
//	      console.log(str.substring(i, j));
//	    }
//	  }
//	};
//
//	const name = "Keerthi";
//	allSubstrings(name);
