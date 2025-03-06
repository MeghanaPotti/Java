package Collections;

import java.util.HashMap;

public class HashMapInt {

	public static void main(String[] args) {
		
		int[] a = {1,2,1,3,2,4};
		HashMap<Integer, Integer> example = new HashMap<>();
		for(int i=0; i<a.length;i++) {
			if(example.containsKey(a[i])) {
				int count = example.get(a[i]);
				example.put(a[i], count+1);
			}
			else {
				example.put(a[i], 1);
			}
		}
		
		for(int b:example.keySet()) {
			int count = example.get(b);
			System.out.println(b+"-"+count+"times");
		}
		
	}

}
