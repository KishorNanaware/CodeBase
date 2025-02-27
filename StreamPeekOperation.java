package myPack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPeekOperation {

	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Kishor", "Anish"), Arrays.asList("Kishor", "Manish"),
				Arrays.asList("Kishor", "Ganesh"), Arrays.asList("Kishor", "Sachin"),
				Arrays.asList("Kishor", "Sandeep"), Arrays.asList("Kishor", "Anish"));

		Set<String> resultStr = new HashSet();

		List<String> result = listOfLists.stream().flatMap(List::stream).distinct().
				sorted()
				.filter(a->a.startsWith("S"))
				.peek(s -> resultStr.add(s.toString())).collect(Collectors.toList());

		System.out.println("   " + resultStr);

	}

}
