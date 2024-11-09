package myPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

	public static void main(String[] args) {
		List<String> name =Arrays.asList("vijay", "ganesh", "sachin", "vijay2", "Eve");
		// Filter names that start with 'A' and convert them to uppercase
        List<String> toUpperCase=
		name.
		stream().
		filter(n->n.startsWith("v"))
		.map(String::toUpperCase)
		.collect(Collectors.toList());
          System.out.println(""+toUpperCase);
	}

}
