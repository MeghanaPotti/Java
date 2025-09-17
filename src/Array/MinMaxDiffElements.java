package Array;

public class MinMaxDiffElements {

	public static void main(String[] args) {
		
		int[] a = {12,3,56,32,44,36,5};
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if(a[i]>max){
				max=a[i];
			}
		}

		System.out.println("Least element is "+min);
		System.out.println("Highest element is "+max);
		System.out.println("Difference between min max elements is "+(max-min));
	}

}


//js


//function minMaxDiff(arr) {
// let min = arr[0];
// let max = arr[0];
//
// for (let i = 0; i < arr.length; i++) {
//     if (arr[i] < min) min = arr[i];
//     else if (arr[i] > max) max = arr[i];
// }
//
// console.log("Least element is", min);
// console.log("Highest element is", max);
// console.log("Difference between min and max elements is", max - min);
//}
//
////Example:
//let a = [12, 3, 56, 32, 44, 36, 5];
//minMaxDiff(a);
