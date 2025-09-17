package Array;

public class DuplicateElements {
	
	public static void main(String[] args) {
		System.out.print("Duplicate elements are ");
		int a[] = {1,2,1,3,4,3,2};
		boolean[] rep = new boolean[a.length];
		
		for(int i=0; i<a.length-1; i++) {
			if(rep[i]) {
				continue;
			}
			int count = 1;
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					rep[j]=true;
				}
			}
//			System.out.println(a[i]+"-"+count+"times");		
			if(count>1) {
				System.out.print(a[i]+" ");
			}
		}		
	}

}

//js

//function duplicateElements() {
//const a = [1, 2, 1, 3, 4, 3, 2];
//const rep = new Array(a.length).fill(false);
//
//process.stdout.write("Duplicate elements are: ");
//
//for (let i = 0; i < a.length - 1; i++) {
// if (rep[i]) {
//   continue;
// }
// let count = 1;
// for (let j = i + 1; j < a.length; j++) {
//   if (a[i] === a[j]) {
//     count++;
//     rep[j] = true;
//   }
// }
// if (count > 1) {
//   process.stdout.write(a[i] + " ");
// }
//}
//console.log();
//}
//
//duplicateElements();

