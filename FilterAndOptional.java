package myPack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterAndOptional {

	public static void main(String[] args) {
		// Find the first name that starts with 'K' ,'V'
		
		List<String> nameList = Arrays.asList("Vijay", "Bob", "Charlie", "David", "Eve");
		Optional<String>strK=nameList.stream().filter(s->s.startsWith("K")).findFirst();
		System.out.println(""+strK);
		System.out.println("Is empty:-"+strK.isEmpty());
		Optional<String>strV=nameList.stream().filter(s->s.startsWith("V")).findFirst();
		strV.ifPresent(v->System.out.println(v));

		}
		

	}

