package main;

import java.util.HashMap;
import java.util.Map;

public class findPairForTargetSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] inputArr = {3,5,1,2,-1,-2};
		int target =4;
		findPair(inputArr, target);
		
	}

	private static void findPair(int[] inputArr, int target) {
		// TODO Auto-generated method stub
		int complement =0;
		int count =1;
		Map<Integer,Integer> mapArr = new HashMap();
		for(int i=0;i<inputArr.length;i++) {
			complement = target-inputArr[i];
			if(complement<0) {
				complement =inputArr[i]- target;
			}
			if(mapArr.containsKey(complement)) {
				mapArr.put(inputArr[i], count++);
				if(complement<0) {
					complement =inputArr[i]- target;
					System.out.println(inputArr[i]+" - "+(complement)+" = "+target);
				}else {
					System.out.println((complement)+"  "+inputArr[i]+""
							+ " = "+target);
				}
			}else {
			    count =1;
				mapArr.put(inputArr[i], count);
			}
		}
		System.out.println(mapArr);
	}
}
