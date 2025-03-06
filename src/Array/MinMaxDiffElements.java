package Array;

public class MinMaxDiffElements {

	public static void main(String[] args) {
		
		int[] a = {12,3,56,32,44,36,5};
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if(a[i]>max){
				max=a[i];
			}
		}

		System.out.println("Least element is "+min);
		System.out.println("Highest element is "+max);
		System.out.println("Difference between min max elements is "+(max-min));
	}

}
