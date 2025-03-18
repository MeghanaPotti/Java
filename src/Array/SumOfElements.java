package Array;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,3,1,4,7};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {  //why not i<arr.length-1?
			sum=sum+arr[i];
		}
		System.out.print("Sum is "+sum);

	}

}
