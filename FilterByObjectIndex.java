package main;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FilterByObjectIndex {

	public static void main(String[] args) {
		// // filter by Object Indices 
		// using AtomicInteger 
		String [] strArr = new String [] {"stream",   "is",  "a", "sequence", "of",  "elements", "like", "list"};
		
		Stream<String> strStream = Stream.of(strArr);
		AtomicInteger i = new AtomicInteger(0);
		
		strStream.filter(x->i.getAndIncrement()%2==0).forEach(System.out::println);
    //stream a of like
		}
}
