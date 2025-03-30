package LinkedIn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithoutSorting {

	public static void main(String[] args) {

		int[] a = {5,6,7,3,3,7,5};
		LinkedHashSet<Integer> example = new LinkedHashSet<>();   // to print an array without sorting linked hashset is used
//		HashSet<Integer> example = new HashSet<>();               // to print an array with sorting hashset is used
		for(int num:a) {
			example.add(num);
		}
		
		for(int num:example) {
			System.out.print(num+" ");
		}

	}

}
