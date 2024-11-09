package myPack;

import java.util.Arrays;
import java.util.List;

public class StreamsToSum {

	public static void main(String [] args) {
		//Using Streams to Sum a List of Integers
		List<Integer> intList= Arrays.asList(1,2,3,4,5,6);
		int sum=intList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}
	
}
