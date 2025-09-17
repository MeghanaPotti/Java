package Strings;

public class CountCharOccurance {

	public static void main(String[] args) {

		String name = "qwerty qwer";
		char target = 't';
		int count = 0;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==target) {
				count++;
			}
		}

		System.out.println(target+"-"+count);
	}

}


//js

//const countCharOccurrence = (str, target) => {
//	  let count = 0;
//
//	  for (let i = 0; i < str.length; i++) {
//	    if (str[i] === target) {
//	      count++;
//	    }
//	  }
//
//	  console.log(`${target}-${count}`);
//	};
//
//	const name = "qwerty qwer";
//	const target = 't';
//	countCharOccurrence(name, target);

