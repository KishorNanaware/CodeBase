package slidingWindow;

public class MaxSubArray {

	public static void main(String[] args) {
		int arr1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n1 = arr1.length;
        System.out.println("         "+maxSumSubArray(arr1, n1));
	}

	static int maxSumSubArray(int arr[],int n) {
		int min_prefrix_sum=0;
		
		int res = Integer.MIN_VALUE;
		
		int [] prefix_sum = new int[n];
		
        prefix_sum[0]=arr[0];
        
		for(int i=1;i<n;i++) {
			prefix_sum[i]=prefix_sum[i-1] +arr[i];
			
			for(int j=0;j<n;j++) {
				res=Math.max(res, prefix_sum[j]-min_prefrix_sum);
				min_prefrix_sum=Math.min(min_prefrix_sum,prefix_sum[j]);
			}
		}
	
		return res;	
		
	}
}
