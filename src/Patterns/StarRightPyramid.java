package Patterns;

public class StarRightPyramid {

	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=1;i<=n;i++) {      
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


//js

//const starRightPyramid = (n) => {
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//
//	    for (let j = 1; j <= n - i; j++) {
//	      line += ' ';
//	    }
//
//	    for (let k = i; k <= 2 * i - 1; k++) {
//	      line += '*';
//	    }
//
//	    console.log(line);
//	  }
//	};
//
//	const n = 6;
//	starRightPyramid(n);
