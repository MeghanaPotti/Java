package Numbers;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int number = 144;
		
		for(int i=0; i<number/2; i++) {
			if(i*i==number) {
				System.out.println(i+" is perfect square for "+number);
//				return;   //why return?
			}
//			else {
//				System.out.println(number+" is not having perfect square");
//			}     // why multiple print statements??
		}

	}

}
