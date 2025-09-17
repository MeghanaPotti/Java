package Strings;

public class IndexesOfChar {

	public static void main(String[] args) {

		String a = "qertuywwqwrqqqqweqa";
		char target = 'q';
		int count = 0;
		
		System.out.print(target+" indexes are ");
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==target) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println(target+"-"+count);
	}
}



//js

//const indexesOfChar = (str, target) => {
//	  let count = 0;
//	  let indexes = [];
//
//	  for (let i = 0; i < str.length; i++) {
//	    if (str[i] === target) {
//	      indexes.push(i);
//	      count++;
//	    }
//	  }
//
//	  console.log(`${target} indexes are ${indexes.join(' ')}`);
//	  console.log(`${target}-${count}`);
//	};
//
//	const a = "qertuywwqwrqqqqweqa";
//	const target = 'q';
//	indexesOfChar(a, target);
