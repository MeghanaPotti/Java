package Array;

public class FirstCommonElement {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,12,2,24};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
					return;
				}
			}
		}
		
		//or
		
		boolean found = false;
	       
	       for(int i=0; i<a.length && !found; i++){
	           for(int j=0; j<b.length; j++){
	               if(a[i] == b[j]){
	                   System.out.println("First common element: " + a[i]);
	                   found = true;
	                   break;
	               }
	           }
	       }

	}

}


