package Patterns;

public class StarReverseLeftPyramid {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {  
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


//js

//const starReverseLeftPyramid = (n) => {
//  for (let i = 1; i <= n; i++) {
//    let line = '';
//    for (let j = 1; j <= n - i + 1; j++) {
//      line += '* ';
//    }
//    console.log(line);
//  }
//};
//
//const n = 5;
//starReverseLeftPyramid(n);
