package Array;

import java.util.Arrays;

public class EvensToLeft {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6};
		int evenIndex = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				int temp = a[i];
				a[i] = a[evenIndex];
				a[evenIndex] = temp;
				evenIndex++;
			}
		}		
		Arrays.sort(a, evenIndex, a.length);
		for(int num:a) {
			System.out.print(num+" ");
		}
		
	}

}


//js

//function evensToLeft(arr) {
// let evenIndex = 0;
//
// // Move evens to the front
// for (let i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 === 0) {
//         [arr[i], arr[evenIndex]] = [arr[evenIndex], arr[i]];
//         evenIndex++;
//     }
// }
//
// // Sort the odd part
// let oddPart = arr.slice(evenIndex).sort((a, b) => a - b);
// for (let i = evenIndex; i < arr.length; i++) {
//     arr[i] = oddPart[i - evenIndex];
// }
//
// return arr;
//}
//
////Example:
//let arr = [1, 2, 3, 4, 5, 6];
//console.log(evensToLeft(arr)); // Output: [2, 4, 6, 1, 3, 5]
