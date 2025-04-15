package Patterns;

public class StarDimondPyramid {

	public static void main(String[] args) {


		int n=5;
		
		for(int i=1; i<2*n; i++) {
			int columns = i>n ? 2*n-i : i;
			int spaces = n-columns;
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<columns; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
