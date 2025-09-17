package Array;

public class RemovingFirstLastElements {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		System.out.println("Array after removing first and last elements");
		for(int i=1;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}


//js


//function removeFirstLast(arr) {
// let result = arr.slice(1, arr.length - 1);
// console.log("Array after removing first and last elements:", result);
// return result;
//}
//
////Example:
//let a = [1, 2, 3, 4, 5];
//removeFirstLast(a); // Output: [2, 3, 4]
