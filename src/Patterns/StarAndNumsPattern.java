package Patterns;

public class StarAndNumsPattern {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0; i<n; i++) {
			for( int j=0; j<n; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print((j+1)+" ");
				}
			}
			System.out.println();
		}

	}

}


//js

//const starAndNumsPattern = (n) => {
//	  for (let i = 0; i < n; i++) {
//	    let line = '';
//	    for (let j = 0; j < n; j++) {
//	      line += (i === j ? '* ' : (j + 1) + ' ');
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 4;
//	starAndNumsPattern(n);
