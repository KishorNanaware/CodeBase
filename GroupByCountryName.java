package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class GroupByCountryName {

	public static void main(String[] args) {
     List<String> countryList = Arrays.asList("India","Srilanka","India","USA","NEPAL","NORWAY");;
     Map<String,Long> result =countryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(" Result "+result);
	}
}
