package Array;

public class CharIntArrayMerging {

	public static void main(String[] args) {
		
		char[] a = {'a', 'b', 'c'};
		int[] b = {1,2,3};
		
		Object[] mergedArray = new Object[a.length+b.length];
		int index = 0;
		
		for(int i=0; i<a.length; i++) {			
			mergedArray[index++] = a[i];
			mergedArray[index++] = b[i];
		}
		
		for(int i=0; i<mergedArray.length; i++) {
			System.out.print(mergedArray[i]+"");
//			if(i<mergedArray.length-1) {
//				System.out.print(",");
//			}
		}

	}

}


//js

//function charIntArrayMerging() {
//const a = ['a', 'b', 'c'];
//const b = [1, 2, 3];
//
//const mergedArray = new Array(a.length + b.length);
//let index = 0;
//
//for (let i = 0; i < a.length; i++) {
// mergedArray[index++] = a[i];
// mergedArray[index++] = b[i];
//}
//
//// Printing merged array
//console.log("Merged Array:", mergedArray.join(""));
//}
//
//charIntArrayMerging();
