package Interview;

public class I3CharLeftHandPramid {

	public static void main(String[] args) {
		 String input = "SERVICENOW";
	        int[] lengths = {1, 2, 3, 4}; 
	        int start = 0;

	        for (int i = 0; i < lengths.length; i++) {
	            int length = i+1; 
	            if (start+length <= input.length()) {
	                System.out.println(input.substring(start, start + length));
	                start = start+length; 
	            }
	        }

	}

}
