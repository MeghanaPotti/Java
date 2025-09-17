package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		
		String name = "QWEWQT";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println("Reverse of "+name+" is "+reverse);
		if(reverse.equals(name)) {
			System.out.println(name+" is palindorme string");
		}
		else {
			System.out.println(name+" is not a palindrome string");
		}
	}

}


//js

//const palindromeString = (str) => {
//	  let reverse = '';
//	  for (let i = str.length - 1; i >= 0; i--) {
//	    reverse += str[i];
//	  }
//
//	  console.log(`Reverse of ${str} is ${reverse}`);
//
//	  if (reverse === str) {
//	    console.log(`${str} is a palindrome string`);
//	  } else {
//	    console.log(`${str} is not a palindrome string`);
//	  }
//	};
//
//	const name = "QWEWQT";
//	palindromeString(name);
