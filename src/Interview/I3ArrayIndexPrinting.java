package Interview;

public class I3ArrayIndexPrinting {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int target = 6;
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index = i;
				break;
			}
		}
		
		if(index!= -1) {
			System.out.println(target+" is at "+index);
		}
		else {
			System.out.println("Element not found in the array");
		}

	}

}
