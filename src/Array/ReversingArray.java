package Array;

public class ReversingArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println("Reverse of an array");
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
