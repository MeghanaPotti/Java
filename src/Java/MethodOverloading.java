package Java;

//import oops.Overloading;

class Overloading {
	
	void sum (int a, int b, int c) {
		System.out.println("Sum is "+(a+b+c));
	}

     void sum (int a, long b) {
    	 System.out.println("long sum is "+(a+b));
     }
     
     void sum (int a, int b) {
    	 System.out.println("Sum is "+(a+b));
     }
     
     void sum (long a, long b, long c) {
    	 System.out.println("Sum is "+(a+b+c));
     }
}

public class MethodOverloading {

	public static void main(String[] args) {
		Overloading addition = new Overloading();
		addition.sum(2, 2012345679);
		addition.sum(7, 8);
		addition.sum(3, 4, 5);
		addition.sum(123456789, 234567891, 345678912);

	}
	
}	