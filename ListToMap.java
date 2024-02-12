package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		//Convert List to Map
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp("Kishor", 1000));
		empList.add(new Emp("Vijay", 10000));
		empList.add(new Emp("Sandesh", 10000));
		empList.add(new Emp("Ganesh", 100000));
		empList.add(new Emp("Suresh", 100000));
		Map<String, Integer> result=empList.stream().collect(Collectors.toMap(Emp::getName,Emp::getSalary));
		System.out.println(" List to Map   "+result);
		
		
	}

}
