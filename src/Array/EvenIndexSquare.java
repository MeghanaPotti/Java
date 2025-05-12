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
