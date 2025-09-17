package Array;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,3,1,4,7};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {  
			sum=sum+arr[i];
		}
		System.out.print("Sum is "+sum);

	}

}


//js


//function sumOfElements(arr) {
// let sum = 0;
// for (let i = 0; i < arr.length; i++) {
//     sum += arr[i];
// }
// console.log("Sum is", sum);
// return sum;
//}

