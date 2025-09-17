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


//js

//const firstAndLastIndex = (str, target) => {
//	  const firstIndex = str.indexOf(target);
//	  const lastIndex = str.lastIndexOf(target);
//
//	  console.log(`First occurrence of ${target} is at ${firstIndex}`);
//	  console.log(`Last occurrence of ${target} is at ${lastIndex}`);
//	};
//
//	const a = "qertuywwqwrqqqqweqa";
//	const target = 'q';
//	firstAndLastIndex(a, target);
