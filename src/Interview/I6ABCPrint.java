package Interview;

public class I6ABCPrint {

	public static void main(String[] args) {
		
		String input = "qofpabcikxabcfdpjasabc";
		String target = "abc";
		int count=0;
		
		while(input.contains(target)) {
			count++;
			input = input.substring(input.indexOf(target)+1);
		}
		
		System.out.println(target+" "+count);
	}

}
