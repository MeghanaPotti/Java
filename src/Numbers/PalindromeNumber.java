package Numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 160010061;
		int reversedNum = number;
		int reverse = 0;
		
		while(reversedNum!=0) {
			reverse = reverse*10+reversedNum%10;
			reversedNum=reversedNum/10;
		}
		System.out.println("Reversed Number is "+reverse);
		
		if(reverse==number) {
			System.out.println(number+" is palindrome");
		}
		else {
			System.out.println(number+" is not palindrome");
		}

	}

}


//js

//const palindromeNumber = (number) => {
//	  let reversedNum = number;
//	  let reverse = 0;
//
//	  while (reversedNum !== 0) {
//	    reverse = reverse * 10 + (reversedNum % 10);
//	    reversedNum = Math.floor(reversedNum / 10);
//	  }
//
//	  console.log("Reversed Number is " + reverse);
//
//	  if (reverse === number) {
//	    console.log(number + " is palindrome");
//	  } else {
//	    console.log(number + " is not palindrome");
//	  }
//	};
//
//	const number = 160010061;
//	palindromeNumber(number);
