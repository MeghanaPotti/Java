package Interview;

public class I3ArrayIndexPrinting {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==4) {
				System.out.println("Index value of 4 is "+i);
			}
		}

	}

}
