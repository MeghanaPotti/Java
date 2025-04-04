package Array;

public class SecLargestElement {

	public static void main(String[] args) {
		
		int[] arr = {12,35,436,3,745};
		int largest = -1, secondLargest = -1;
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];			
			}
		}
		System.out.println(secondLargest);
	}

}
