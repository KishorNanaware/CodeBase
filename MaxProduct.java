package myPack;

public class MaxProduct {

	public static void main(String[] args) {
		// Maximum Product Sub array
		int input [] = {2, 3, -2, 4};
		System.out.println(" Get max product "+getMaxProduct(input));

	}

	private static int getMaxProduct(int[] input) {
		int maxProduct=input[0];
		int maxCurrentProduct=input[0];
		int minCurrentProduct=input[0];
		
		for(int i=1;i<input.length;i++) {
			if(input[i]<0) { //if input is less than 0 or negative, Swap it
				int temp=maxCurrentProduct;
				maxCurrentProduct=minCurrentProduct;
				minCurrentProduct=temp;
			}
		maxCurrentProduct=Math.max(input[i],maxCurrentProduct* input[i]);
		minCurrentProduct=Math.min(input[i],minCurrentProduct*input[i]);
		maxProduct = Math.max(maxProduct, maxCurrentProduct);
			
		}
		
		return maxProduct;
	}

}
