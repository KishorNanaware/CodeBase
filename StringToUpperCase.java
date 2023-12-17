package main;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.Map;

public class StringToUpperCase {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<String> collect  =alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		Map<String,Long> map=alpha.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
	}
}
