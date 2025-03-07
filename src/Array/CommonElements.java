package Array;

public class CommonElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,12,2,24};
		System.out.println("Common elements are ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");  
				}
			}
		}
		
	}
}
