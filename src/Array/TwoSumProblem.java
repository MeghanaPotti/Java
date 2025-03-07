package Array;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int target = 5;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==(target-a[i])) {
					System.out.println("Elements are "+a[i]+","+a[j]);
				}
			}
		}

	}

}
