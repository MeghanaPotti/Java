package Array;

public class ZerosToRight {

	public static void main(String[] args) {
		
		int a[] = {0,1,0,2,0,3,0,4,0,5,0,0,6};
		int nonZeroIndex = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i]=a[nonZeroIndex];
				a[nonZeroIndex]=temp;
				
				nonZeroIndex++;
			}
		}
		System.out.println("Printing zero's to right");
		
		for(int num:a) {
			System.out.print(num+" ");
		}
	}
}


//js

//function zerosToRight(arr) {
// let nonZeroIndex = 0;
//
// for (let i = 0; i < arr.length; i++) {
//     if (arr[i] !== 0) {
//         [arr[i], arr[nonZeroIndex]] = [arr[nonZeroIndex], arr[i]];
//         nonZeroIndex++;
//     }
// }
//
// console.log("Printing zeros to right:", arr);
// return arr;
//}
