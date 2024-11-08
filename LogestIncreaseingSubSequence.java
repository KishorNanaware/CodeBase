package myPack;

import java.util.Arrays;

public class LogestIncreaseingSubSequence {

	public static void main(String[] args) {
		int [] input={10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(""+maxIncrequenceSquence(input));
		

	}

	private static int maxIncrequenceSquence(int[] input) {
		
		int [] dp=new int [input.length];
		Arrays.fill(dp, 1);
		int maxLip=1;
		for (int i=1;i<input.length;i++) {
			for (int j=0;j<i;j++) {
				if (input[i]>input[j]) {
					dp[i]=Math.max(dp[i],dp[j]+1);
				}
			}
			maxLip=Math.max(maxLip, dp[i]);
		}
		return maxLip;
	}

}
