package Patterns;

public class NumsPyramid {   //?

	public static void main(String[] args) {
		
		 int n = 5;
	        for (int i = 1; i <= n; i++) {
	            for (int space = n; space > i; space--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
		

	}

}


//js

//const numsPyramid = (n) => {
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//
//	    for (let space = n; space > i; space--) {
//	      line += ' ';
//	    }
//
//	    for (let j = 1; j <= i; j++) {
//	      line += j;
//	    }
//
//	    for (let j = i - 1; j >= 1; j--) {
//	      line += j;
//	    }
//
//	    console.log(line);
//	  }
//	};
//
//	const n = 5;
//	numsPyramid(n);
