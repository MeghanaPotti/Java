package Patterns;

public class StarSquarePattern {

	public static void main(String[] args) {

         int n=5;
         
         for(int i=1; i<=n; i++) {
        	 for(int j=1; j<=n; j++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
		
	}

}


//js

//const starSquarePattern = (n) => {
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//	    for (let j = 1; j <= n; j++) {
//	      line += '* ';
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 5;
//	starSquarePattern(n);
