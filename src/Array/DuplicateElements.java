package Array;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,1,3,4,3,2};		
		for(int i=0; i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicated elements are "+a[i]);  //count (new program in chatgpt)
				}
			}
		}
	}

}
