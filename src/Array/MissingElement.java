package Array;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,5,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
	
		//missing elements
		for(int j=0;j<a.length-1;j++) {
			if(a[j+1]-a[j]>1) {
				System.out.println("Missing element is "+(a[j]+1));
			}
		}
		
//		int sum1=0;
//		for(int i=0;i<8;i++) {
//			sum1=sum1+i;
//		}

		int n=8;
		int sum1 = (n*(n+1)/2);
		
		System.out.println("Sum of array elements is "+sum);
		System.out.println("Sum of first 7 numbers is "+sum1);
		System.out.println("Missing element in an array is "+(sum1-sum));
	}

}


//array methods - sort, compare/equals
//array programs - zero to left&right, two sum problem, missing elements, remove first and last elements,