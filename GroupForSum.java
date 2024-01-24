package main;

import java.util.Arrays;
import java.util.List;
//Create pair of number having Sum equal to 9 from list of integer

public class GroupForNumber {

	public static void main(String[] args) {
		
        List<Integer> inputList = Arrays.asList(1,8,2,6,7,2,5,7);
        groupNumberforSum(inputList,9);
        
       
	}

	private static void groupNumberforSum(List<Integer> inputList, int Sum) {
		 inputList.stream().flatMap(i->inputList.stream().filter(j->j+i==Sum)).
	        map(k->k +" "+(Sum-k)).distinct().forEach(System.out::println);
	}

}

