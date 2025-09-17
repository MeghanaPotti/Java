package Strings;

public class SecondOccuranceReplace {

	public static void main(String[] args) {

		String input = "tomorrow";
		char target = 'o';
		int count = 0;
		String output = "";
		
		for(int i=0; i<input.length(); i++) {			
			if(input.charAt(i)==target) {
				count++;
				if(count==2) {
					output = output+'$';
					continue;
				}
			}
			output = output+input.charAt(i);
		}
	  System.out.println(output);
	}

}


//js

//const secondOccurrenceReplace = (input, target) => {
//	  let count = 0;
//	  let output = '';
//
//	  for (let i = 0; i < input.length; i++) {
//	    if (input[i] === target) {
//	      count++;
//	      if (count === 2) {
//	        output += '$';
//	        continue;
//	      }
//	    }
//	    output += input[i];
//	  }
//
//	  console.log(output);
//	};
//
//	const input = "tomorrow";
//	const target = 'o';
//	secondOccurrenceReplace(input, target);


