package Interview;

public class I3ArrayIndexPrinting {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,2};
		int target = 9;
		int count=0;
		System.out.print("Index of "+target+" is ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		if(count>1) {
			System.out.println(target+" is repeated "+count+" times");
		}
		else {
			System.out.println("Element not found in the array");
		}

	}

}
