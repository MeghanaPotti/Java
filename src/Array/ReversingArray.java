package Array;

public class ReversingArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println("Reverse of an array");
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}


//js


//function reverseArray(arr) {
// let reversed = [];
// for (let i = arr.length - 1; i >= 0; i--) {
//     reversed.push(arr[i]);
// }
// console.log("Reverse of an array:", reversed);
// return reversed;
//}
//
////Example:
//let a = [1, 2, 3, 4, 5];
//reverseArray(a); // Output: [5, 4, 3, 2, 1]
