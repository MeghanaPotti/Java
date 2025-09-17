package Array;

public class RotatingArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int rotateCount = 3;
		int[] rotatedArray = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			rotatedArray[(i+rotateCount)%arr.length] = arr[i]; //circular rotation formula
		}
		
		for(int num:rotatedArray) {
			System.out.print(num+" ");
		}

	}

}


//js


//function rotateArray(arr, rotateCount) {
// let rotatedArray = new Array(arr.length);
// for (let i = 0; i < arr.length; i++) {
//     rotatedArray[(i + rotateCount) % arr.length] = arr[i];
// }
// console.log("Rotated array:", rotatedArray);
// return rotatedArray;
//}
//
////Example:
//let arr = [1, 2, 3, 4, 5];
//let rotateCount = 3;
//rotateArray(arr, rotateCount); // Output: [3, 4, 5, 1, 2]
