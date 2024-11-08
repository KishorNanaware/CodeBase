//Given a HashMap<String, Integer> representing names and their ages, write code to use Java Streams to filter out entries where age is less than 18 and collect the remaining entries into a new HashMap

package myPack;
import java.util.*;
import java.util.stream.Collectors;

public class FilterByAge {

	public static void main(String[] args) {
	Map<String, Integer> empMap= new HashMap<String,Integer>();
	empMap.put("Amol",15);
	empMap.put("Sachin",18);
	empMap.put("Vijay",20);
	empMap.put("Sandesh",25);
	empMap.put("Ganesh",35);
	
	Map<String, Integer> filterObj=empMap.entrySet().stream()
			.filter(entrySet->entrySet.getValue()>=18)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
	System.out.println(filterObj);

	}

}
