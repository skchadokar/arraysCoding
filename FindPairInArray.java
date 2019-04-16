//n time

import java.util.Arrays;

public class FindPairInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,5};
		int b[]= {21,2,3,24,5,5};
		int c[]= {11,2,23,24,5,5};
		Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
		int ia =0,ib=0,ic=0;
		while(ia<a.length && ib<b.length && ic<c.length) {
			if(a[ia]==b[ib] && b[ib]==c[ic]) {
				System.out.println(a[ia]);
				//ic++;ia++;ib++;
			}
			if(ia<a.length &&ib <b.length && a[ia]<b[ib]  ){
				ia++;
			}else if(ib<b.length && ic<c.length && b[ib]<c[ic]) {
				ib++;
			}else {
				ic++;
			}
			
		}
	}
}
