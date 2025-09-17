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


//js


//const extractLast4 = (str) => {
//	  const lowerStr = str.toLowerCase();
//	  const start = lowerStr.length - 4;
//
//	  let result = '';
//	  for (let i = start; i < lowerStr.length; i++) {
//	    result += lowerStr[i];
//	  }
//
//	  console.log(result);
//	};
//
//	const name = "Meghana";
//	extractLast4(name);
