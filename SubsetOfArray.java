
public class SubsetOfArray {

	public static void main(String[] args) {
		Integer givenArr[] = {1,2,3};
		Integer subsetArr[] = new Integer[givenArr.length];
		helper(givenArr,subsetArr,0);
	}

	private static void helper(Integer[] givenArr, Integer[] subsetArr,int pos) {
		if(pos==givenArr.length) {
			for(int i=0;i<subsetArr.length;i++) {
				if(subsetArr[i]!=null)
				System.out.print(subsetArr[i]+",");
			}
			System.out.println();
			
		}else {
			subsetArr[pos] = null;
			helper( givenArr,  subsetArr,pos+1);
			subsetArr[pos] = givenArr[pos];
			helper(givenArr,  subsetArr,pos+1);
			
		}
		
	}
}
