package Array;

public class ArrayCopying {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6};
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Printing duplicate array");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}

//js

//function arrayCopying() {
//const a = [1, 2, 3, 4, 5, 6];
//const b = new Array(a.length);
//
//for (let i = 0; i < a.length; i++) {
// b[i] = a[i];
//}
//
//console.log("Printing duplicate array:");
//console.log(b.join(" "));
//}
//
//arrayCopying();
