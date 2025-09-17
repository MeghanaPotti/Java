package Array;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,1};
		int[] reversedArray = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			reversedArray[i]=arr[arr.length-1-i];  
		}
		
		for(int num:reversedArray) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		if(Arrays.equals(arr, reversedArray)) {
			System.out.println("Given array is palindrome");
		}
		else {
			System.out.println("Given array is not a palindrome");
		}
	}

}

// Increment a Number Represented as an Array?
// Sort Array of 0,1,2 in O(n) time?

//Check if an array is palindrome

//function isPalindromeArray(arr) {
// let reversedArray = [...arr].reverse();
// console.log("Reversed array:", reversedArray);
// if (arr.every((val, index) => val === reversedArray[index])) {
//     console.log("Given array is palindrome");
// } else {
//     console.log("Given array is not a palindrome");
// }
//}
//
////Example:
//let arr = [1, 2, 3, 2, 1];
//isPalindromeArray(arr);

//Increment a number represented as an array

//function incrementArrayNumber(arr) {
// for (let i = arr.length - 1; i >= 0; i--) {
//     if (arr[i] < 9) {
//         arr[i]++;
//         return arr;
//     }
//     arr[i] = 0;
// }
// arr.unshift(1);
// return arr;
//}

//Example:
//let numArr = [1, 2, 9];
//console.log(incrementArrayNumber(numArr)); // Output: [1,3,0]

//Sort array of 0,1,2 in O(n) time (Dutch National Flag)

//function sort012(arr) {
// let low = 0, mid = 0, high = arr.length - 1;
// while (mid <= high) {
//     if (arr[mid] === 0) {
//         [arr[low], arr[mid]] = [arr[mid], arr[low]];
//         low++;
//         mid++;
//     } else if (arr[mid] === 1) {
//         mid++;
//     } else {
//         [arr[mid], arr[high]] = [arr[h]()]()
