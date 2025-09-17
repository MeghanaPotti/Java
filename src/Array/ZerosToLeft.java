package Array;

public class ZerosToLeft {

	public static void main(String[] args) {
		
		int a[] = {0,1,0,2,0,3,4,0,5,0,0};
		int nonZeroIndex = a.length-1;
		
		for(int i=a.length-1; i>=0;i--) {
			if(a[i]!=0) {
				
				int temp=a[i];
				a[i]=a[nonZeroIndex];
				a[nonZeroIndex]=temp;
				
				nonZeroIndex--;
			}
		}
		System.out.println("Printing zero's to left");
		for(int num:a) {
			System.out.print(num+" ");
		}
	}

}


//js

//function zerosToLeft(arr) {
//    let nonZeroIndex = arr.length - 1;
//
//    for (let i = arr.length - 1; i >= 0; i--) {
//        if (arr[i] !== 0) {
//            [arr[i], arr[nonZeroIndex]] = [arr[nonZeroIndex], arr[i]];
//            nonZeroIndex--;
//        }
//    }
//
//    console.log("Printing zeros to left:", arr);
//    return arr;
//}