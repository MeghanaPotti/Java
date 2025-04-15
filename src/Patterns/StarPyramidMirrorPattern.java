package Patterns;

public class StarPyramidMirrorPattern {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1; i<2*n; i++) {
			int columns = i>n ? 2*n-i : i;
			for(int j=0; j<columns; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}



