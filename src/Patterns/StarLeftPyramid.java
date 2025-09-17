package Patterns;

public class StarLeftPyramid {

	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		// or
//		
//		for(int i=1;i<=n;i++) {      
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("");
//			}
//			for(int k=i;k<=2*i-1;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}

}


//js

//const starLeftPyramid = (n) => {
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//	    for (let j = 1; j <= i; j++) {
//	      line += '* ';
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 6;
//	starLeftPyramid(n);
