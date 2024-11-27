package myPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTopKMinElement {

	public static void main(String[] args) {
		int [] inputList = {10,20,3,0,4,8,9,66};
		IntStream intList= Arrays.stream(inputList);
		Stream<Long> lStream=getKMaxElement(intList,3);
		lStream.forEachOrdered(i->System.out.print(" "+i));
	}

	private static Stream<Long> getKMaxElement(IntStream iList, int i) {

		return iList.asLongStream().boxed().sorted(Comparator.naturalOrder()).limit(i);
		}

}
