package LinkedIn;

import java.util.Arrays;

public class EvensToRight {

	public static void main(String[] args) {
		
		int[] a = {11,13,14,15,16,18,17};
		int evenIndex = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				int temp = a[i];
				a[i] = a[evenIndex];
				a[evenIndex] = temp;
				evenIndex++;
			}
		}
		
		Arrays.sort(a, evenIndex, a.length);
		for(int num:a) {
			System.out.print(num+" ");
		}
		
	}
}
