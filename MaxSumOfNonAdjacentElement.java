package myPack;

public class MaxSumOfNonAdjacentElement {

	public static void main(String[] args) {

		int [] input = {3,2,5,10,7};
		System.out.println(""+sumOfNonAdjacentEle(input));
	}

	private static int sumOfNonAdjacentEle(int[] input) {
	
		int prevOne=Math.max(input[0], input[1]);
		int preTwo=input[0];
		for(int i=2;i<input.length;i++) {
			int current=Math.max(prevOne,input[i]+preTwo);
			preTwo=prevOne;
			prevOne=current;
		}
		return prevOne;
	}

}
