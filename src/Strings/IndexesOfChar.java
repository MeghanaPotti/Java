package Strings;

public class IndexesOfChar {

	public static void main(String[] args) {

		String a = "qertuywwqwrqqqqweqa";
		char target = 'q';
		int count = 0;
		
		System.out.print(target+" indexes are ");
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==target) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println(target+"-"+count);
	}
}
