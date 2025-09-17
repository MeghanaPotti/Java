package Patterns;

public class NumsLeftTraingle {

	public static void main(String[] args) {
		
	    int n=6;
	    
	    for(int i=1; i<=n;i++) {
	    	for(int j=1; j<=i; j++) {
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }
	
	}
}


//js

//const numsLeftTriangle = (n) => {
//	  for (let i = 1; i <= n; i++) {
//	    let line = '';
//	    for (let j = 1; j <= i; j++) {
//	      line += j;
//	    }
//	    console.log(line);
//	  }
//	};
//
//	const n = 6;
//	numsLeftTriangle(n);
