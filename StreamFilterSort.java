package myPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterSort {

	public static void main(String[] args) {
		// Filter even numbers, sort them, and collect to a list
		List<Integer> number = Arrays.asList(5, 3, 8, 1, 2, 9, 6);
		List<Integer> evenList=number.stream()
		.filter(n->n%2==0)
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(""+evenList);

	}

}
