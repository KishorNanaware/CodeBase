//To find pairs of numbers in an array that add up to a target value, 

package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String [] args) {
		int [] intArray = {0,1,2,3,4,5,6,7,8,9};
		int target=9;
		Map<Integer,Integer> indexMap=getMapOfIndexforSum(intArray,target);
		System.out.println(""+indexMap);
	}

	private static Map<Integer,Integer> getMapOfIndexforSum(int[] intArray, int target) {
		Map <Integer,Integer> mapObj= new HashMap<Integer, Integer>();
		Map <Integer,Integer> returnObj= new HashMap<Integer, Integer>();
		for(int i=0;i<intArray.length;i++) {
			int complment=target - intArray[i];
			if(mapObj.containsKey(complment)) {
				 System.out.println("Pair found: (" + complment + ", " + intArray[i] + ")");
				 returnObj.put(complment  , i);
			}
			mapObj.put(intArray[i], mapObj.getOrDefault(intArray[i], 0) + 1);
		}
		return returnObj;
	}

}
