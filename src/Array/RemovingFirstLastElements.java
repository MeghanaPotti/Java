package Array;

public class RemovingFirstLastElements {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		System.out.println("Array after removing first and last elements");
		for(int i=1;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
