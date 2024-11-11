//ArrayList of Strings alphabetically in reverse/descending order:

package main;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderList {

	public static void main(String[] args) {
		// Strings alphabetically in reverse/descending order:
		
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("A");
		cars.add("B");
		cars.add("C");
		cars.add("D");
		cars.add("E");
		Collections.sort(cars,Collections.reverseOrder());
		cars.forEach(System.out::println);

	}

}
