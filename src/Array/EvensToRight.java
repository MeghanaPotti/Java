package Array;

import java.util.Arrays;

public class EvensToRight {

	public static void main(String[] args) {
		
		int[] a = {11,13,14,15,16,18,17};
		int evenIndex = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
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

//function evensToRight(arr) {
// let oddIndex = 0;
//
// for (let i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 !== 0) {
//         [arr[i], arr[oddIndex]] = [arr[oddIndex], arr[i]];
//         oddIndex++;
//     }
// }
//
// let evenPart = arr.slice(oddIndex).sort((a, b) => a - b);
// for (let i = oddIndex; i < arr.length; i++) {
//     arr[i] = evenPart[i - oddIndex];
// }
//
// return arr;
//}
//
////Example:
//let arr = [11, 13, 14, 15, 16, 18, 17];
//console.log(evensToRight(arr)); // Output: [11, 13, 15, 17, 14, 16, 18]
