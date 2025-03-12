package Interview;

public class I5PrintOnlyNums {

	public static void main(String[] args) {
		
		String name = "abcd: 123456";
		String replaced = name.replaceAll("[^\\d]", "");
		System.out.println(replaced);

	}

}
