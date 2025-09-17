package Array;

public class EvenOddElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		  String evenNumbers = "Even numbers are ";
	      String oddNumbers = "Odd numbers are ";
	      int evenCount = 0, oddCount = 0;

		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenNumbers = evenNumbers+a[i]+" ";
				evenCount++;
			}
			else {
				oddNumbers = oddNumbers+a[i]+" ";
				oddCount++;
			}
		}
		
		System.out.println(evenNumbers+"("+evenCount+")");
		System.out.println(oddNumbers+"("+oddCount+")");
	}
}


//js

//function evenOddElements() {
//const a = [1, 2, 3, 4, 5];
//
//let evenNumbers = "Even numbers are ";
//let oddNumbers = "Odd numbers are ";
//let evenCount = 0, oddCount = 0;
//
//for (let i = 0; i < a.length; i++) {
// if (a[i] % 2 === 0) {
//   evenNumbers += a[i] + " ";
//   evenCount++;
// } else {
//   oddNumbers += a[i] + " ";
//   oddCount++;
// }
//}
//
//console.log(`${evenNumbers} (${evenCount})`);
//console.log(`${oddNumbers} (${oddCount})`);
//}
//
//evenOddElements();


//optimised


//function evenOddElementsOptimized() {
//	  const a = [1, 2, 3, 4, 5];
//
//	  const evens = a.filter(num => num % 2 === 0);
//	  const odds = a.filter(num => num % 2 !== 0);
//
//	  console.log(`Even numbers are ${evens.join(" ")} (${evens.length})`);
//	  console.log(`Odd numbers are ${odds.join(" ")} (${odds.length})`);
//	}
//
//	evenOddElementsOptimized();


