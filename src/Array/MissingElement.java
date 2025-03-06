package Array;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}

//		int sum1=0;
//		for(int i=0;i<8;i++) {
//			sum1=sum1+i;
//		}

		int n=7;
		int sum1 = (n*(n+1)/2);
		
		System.out.println("Sum of array elements is "+sum);
		System.out.println("Sum of first 7 numbers is "+sum1);
		System.out.println("Missing element in an array is "+(sum1-sum));
	}

}
