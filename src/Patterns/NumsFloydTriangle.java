package Patterns;

public class NumsFloydTriangle {

	public static void main(String[] args) {
		
		int n=4, num=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
			

	}

}


//js

//const numsFloydTriangle = (n) => {
//	  let num = 1;
//
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//	    for (let j = 1; j <= i; j++) {
//	      line += num + ' ';
//	      num++;
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 4;
//	numsFloydTriangle(n);
