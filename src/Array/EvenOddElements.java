package Array;

public class EvenOddElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		  String evenNumbers = "Even numbers are ";
	      String oddNumbers = "Odd numbers are ";

		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenNumbers = evenNumbers+a[i]+" ";
			}
			else {
				oddNumbers = oddNumbers+a[i]+" ";
			}
		}
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
	}
}
