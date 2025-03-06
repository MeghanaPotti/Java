package Array;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] numbers = {23,11,35,2,14,7};
		
		for(int i=0;i<numbers.length-1;i++) {
			int min = i;
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[j]<numbers[min]) {
					min=j;
				}
			}			
			int temp = numbers[min];
			numbers[min] = numbers[i];
			numbers[i] = temp;
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}

		System.out.println();
		System.out.println("Largest number is "+numbers[numbers.length-1]);
		System.out.println("2nd Largest number is "+numbers[numbers.length-2]);
		System.out.println("Middle number is "+numbers[numbers.length/2]);
	}

}
