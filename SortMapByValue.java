package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortMapByValue {

	public static void main(String[] args) {
		// Sort map by value in descending order
		Map<String,Integer> inputMap= new HashMap();
		inputMap.put("Amol", 1);
		inputMap.put("Bimal", 2);
		inputMap.put("Chetan", 3);
		inputMap.put("Diggu", 4);
		inputMap.put("Harshu", 5);
		
		System.out.println(" Input ->"+inputMap);
		
		List result=
		inputMap.entrySet().stream()
		.sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).toList();

		System.out.println(" Output ->"+result);
		
	}

}
