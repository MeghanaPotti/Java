package LinkedIn;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,1};
		int[] reversedArray = new int[arr.length];
//		
//		for(int i=0; i<arr.length;i++) {
//			reversedArray[i]=arr[i];
//		}
//		
//		for(int i=reversedArray.length-1; i>=0; i--) {
//			System.out.print(reversedArray[i]+" ");
//		}
//		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			reversedArray[i]=arr[arr.length-1-i];   //?
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

 