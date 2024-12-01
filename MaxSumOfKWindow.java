package myPack;

public class MaxSumOfKWindow {

	public static void main(String[] args) {
		int [] intArr= {5,8,7,6,4,9,2,1,0,3};
		int k=2;
		int windowSum=0;
		int maxSum=0;
		
		for(int i=0;i<k;i++) {
			windowSum+=intArr[i];
		}
		
		maxSum=windowSum;
	
		for (int j=k;j<intArr.length;j++) {
			windowSum=intArr[j]-intArr[j-k];
			maxSum=Math.max(maxSum, windowSum);
		}
		System.out.println("  "+maxSum);
	}
}
