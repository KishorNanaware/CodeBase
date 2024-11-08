
public class FindLargestSumOfContinuesArray {

	public static void main(String[] args) {

    int []num = {1, -2, 3, 4, -1, 2, 1, -5, 4};
    System.out.println("Maximum Sub Array Sum : "+getMaxSubArraySum(num));

	}

	private static int getMaxSubArraySum(int[] num) {
		int currentSum=num[0];
		int maxSum=num[0];
		for(int i=1;i<num.length;i++) {
			currentSum=Math.max(num[i],currentSum+num[i]);
			maxSum=Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
