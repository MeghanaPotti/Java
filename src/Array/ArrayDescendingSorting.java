package Array;

import java.util.Arrays;

public class ArrayDescendingSorting {

	public static void main(String[] args) {
		
		int[] a = {12,14,245,46,4,768};
		
		Arrays.sort(a);
		System.out.println("Array after ascending sorting "+Arrays.toString(a));
		
		for(int i=0; i<a.length/2;i++) {   //?
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		System.out.println("Array after descending sorting "+Arrays.toString(a));
	}

}
