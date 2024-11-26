package myPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FindTopKElement {

	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5,6,7,8};
		IntStream intList= Arrays.stream(intArr);
		int k =3;
		Stream<Long>  longList=topMaxElement(intList,k);
		longList.forEach(i->System.out.print(" "+i));
	
	}

	private static Stream<Long> topMaxElement(IntStream intList, int k) {
		 Stream<Long> topLkist=intList.asLongStream()
		      .boxed()
		      .sorted(Comparator.reverseOrder())
				.limit(k);
		return topLkist;
	}
}
