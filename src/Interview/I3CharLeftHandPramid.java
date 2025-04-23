package Interview;

public class I3CharLeftHandPramid {

	public static void main(String[] args) {
		 String input = "SERVICENOWASDFGQ";
//	        int[] lengths = {1, 2, 3, 4}; 
//	        int start = 0;
//
//	        for (int i = 0; i < lengths.length; i++) {
//	            int length = i+1; 
//	            if (start+length <= input.length()) {
//	                System.out.println(input.substring(start, start + length));
//	                start = start+length; 
//	            }
//	        }
		 
		 // or
	        int n=4;
	        int inputLength = input.length();
	        int num = 0;
			
			for(int i=1; num<inputLength; i++) {  //for(int i=1; i<=n; i++), for(int i=1; i<=inputLength/2 && num<inputLength; i++)
				for(int j=1; j<=i; j++) {
					if(num>=inputLength)
						break;
					System.out.print(input.charAt(num)+"");
					num++;
				}
				System.out.println();
			}
		 

	}

}
