package Array;

public class RotatingArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int rotateCount = 3;
		int[] rotatedArray = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			rotatedArray[(i+rotateCount)%arr.length] = arr[i]; //circular rotation formula
		}
		
		for(int num:rotatedArray) {
			System.out.print(num+" ");
		}

	}

}
