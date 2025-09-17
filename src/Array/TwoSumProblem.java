package Array;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int target = 5;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==(target-a[i])) {
					System.out.println("Elements are "+a[i]+","+a[j]);
				}
			}
		}

	}

}


//js

//function twoSum(arr, target) {
//    for (let i = 0; i < arr.length; i++) {
//        for (let j = i + 1; j < arr.length; j++) {
//            if (arr[i] + arr[j] === target) {
//                console.log("Elements are", arr[i], ",", arr[j]);
//            }
//        }
//    }
//}