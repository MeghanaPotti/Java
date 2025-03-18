package Array;

public class EvenOddElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		  String evenNumbers = "Even numbers are ";
	      String oddNumbers = "Odd numbers are ";
	      int evenCount = 0, oddCount = 0;

		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenNumbers = evenNumbers+a[i]+" ";
				evenCount++;
			}
			else {
				oddNumbers = oddNumbers+a[i]+" ";
				oddCount++;
			}
		}
		
		System.out.println(evenNumbers+"("+evenCount+")");
		System.out.println(oddNumbers+"("+oddCount+")");
	}
}
