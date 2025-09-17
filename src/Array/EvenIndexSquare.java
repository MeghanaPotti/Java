package Array;

public class EvenIndexSquare {

	public static void main(String[] args) {
		
		int[] a = {1,4,3,6,8};
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				a[i] = a[i]*a[i];
			}
		}
		
		for(int num : a) {
			System.out.print(num+" ");
		}

	}

}


//js

//function evenIndexSquare() {
//let a = [1, 4, 3, 6, 8];
//
//for (let i = 0; i < a.length; i++) {
// if (a[i] % 2 === 0) {
//   a[i] = a[i] * a[i];
// }
//}
//
//console.log("Updated Array:", a.join(" "));
//}
//
//evenIndexSquare();


//optimised

//function evenIndexSquareOptimized() {
//	  const a = [1, 4, 3, 6, 8];
//	  const updated = a.map(num => (num % 2 === 0 ? num * num : num));
//	  console.log("Updated Array (map):", updated.join(" "));
//	}
//
//	evenIndexSquareOptimized();

