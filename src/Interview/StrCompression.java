package Interview;

public class StrCompression {

	public static void main(String[] args) {
	
		String input = "aabbbccccaa";
		int count = 1;
		
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				count++;
			}
			else {
				System.out.print(input.charAt(i-1)+""+count);
				count=1;
			}
		}
		
		System.out.print(input.charAt(input.length()-1)+""+count);
	}

}

