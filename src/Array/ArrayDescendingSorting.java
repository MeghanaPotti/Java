package Array;

import java.util.Arrays;

public class ArrayDescendingSorting {

	public static void main(String[] args) {
		
		int[] a = {12,14,245,46,4,768};
		
		Arrays.sort(a);
		System.out.println("Array after ascending sorting "+Arrays.toString(a));
		
		for(int i=0; i<a.length/2;i++) {   
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		System.out.println("Array after descending sorting "+Arrays.toString(a));
		
		//or
		
		for(int i=0;i<a.length-1;i++) {
			int max = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[max]) {
					max=j;
				}
			}			
			int temp = a[max];
			a[max] = a[i];
			a[i] = temp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}


//js

//function arrayDescendingSorting() {
//let a = [12, 14, 245, 46, 4, 768];
//
//// Ascending order (using built-in sort)
//a.sort((x, y) => x - y); // Comparator for numeric ascending
//console.log("Array after ascending sorting:", a);
//
//// Descending order (manual reverse after ascending)
//for (let i = 0; i < Math.floor(a.length / 2); i++) {
// let temp = a[i];
// a[i] = a[a.length - 1 - i];
// a[a.length - 1 - i] = temp;
//}
//console.log("Array after descending sorting:", a);
//
//// OR — implement selection sort for descending
//for (let i = 0; i < a.length - 1; i++) {
// let max = i;
// for (let j = i + 1; j < a.length; j++) {
//   if (a[j] > a[max]) {
//     max = j;
//   }
// }
// let temp = a[max];
// a[max] = a[i];
// a[i] = temp;
//}
//
//console.log("Array after selection sort (descending):", a.join(" "));
//}
//
//arrayDescendingSorting();
