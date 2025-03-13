package Array;

import java.util.Arrays;

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
		Arrays.sort(mergedArray);  //print statements before and after sorting?
		for(int num:mergedArray) {
			System.out.print(num+" ");
			
		}
		

	}

}
