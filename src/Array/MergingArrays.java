package Array;

import java.util.Arrays;
import java.util.Collections;

public class MergingArrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {7,5,6};
		
		int[] mergedArray = new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			mergedArray[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			mergedArray[a.length+i]=b[i];
		}

		System.out.println("before sorting "+Arrays.toString(mergedArray));
		
		Arrays.sort(mergedArray); 
		System.out.println("After sorting "+Arrays.toString(mergedArray));
		
	}
}

