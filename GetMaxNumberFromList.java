package main;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class GetMaxNumberFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number= Arrays.asList(1,2,3,4,5,8,9,0);
		IntSummaryStatistics stats= number
				              .stream()
				              .mapToInt((x)->x)
				              .summaryStatistics();
		System.out.println(stats.getMax());
	}
}
