package Patterns;

public class NumInvertedLeftTriangle {

	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=n; i>=0;i--) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}


//js

//const numInvertedLeftTriangle = (n) => {
//	  for (let i = n; i >= 0; i--) {
//	    let line = '';
//	    for (let j = 1; j <= i; j++) {
//	      line += j;
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 6;
//	numInvertedLeftTriangle(n);
