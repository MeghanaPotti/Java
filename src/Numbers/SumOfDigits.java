package Numbers;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 123345345;
		int sum = 0;
		
		while(number>0) {
			sum = sum+number%10;
			number = number/10;
		}
		System.out.println("Sum is "+sum);

	}

}


//js

//const sumOfDigits = (number) => {
//	  let sum = 0;
//
//	  while (number > 0) {
//	    sum += number % 10;
//	    number = Math.floor(number / 10);
//	  }
//
//	  console.log("Sum is " + sum);
//	};
//
//	const number = 123345345;
//	sumOfDigits(number);
