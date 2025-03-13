package Numbers;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int number = 141;
		boolean flag = false;
		for(int i=0; i<number/2; i++) {
			if(i*i==number) {
				flag=true;
				System.out.println(i+" is perfect square for "+number);
				break;   
			} 
		}
		if(flag==false) {
			System.out.println(number+" is not a perfect square");
		}

	}

}
