package myPack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionAndCount {

	public static void main(String[] args) {
	List<Integer> marks = Arrays.asList(40, 55, 65, 30, 70, 45); 
	Map<Boolean,Long> partitionedCount = marks.stream().collect(Collectors.partitioningBy(m->m>=50,Collectors.counting()));
	System.out.println("     Pass      "+partitionedCount.get(true))	;
	
	System.out.println("      Fail     "+partitionedCount.get(false));

	}

}
