package main;

import java.util.HashMap;

public class HashMapGetOrDefault {

	public static void main(String[] args) {
		// The getOrDefault() method returns 
		//the value of the entry in the map which has a specified key. 
		//If the entry does not exist then the value of the second parameter is returned.

		
		HashMap<String,String> capitalCity = new HashMap<String,String>();
		capitalCity.put("India", "Delhi");
		capitalCity.put("England", "London");
		capitalCity.put("Germany", "Berlin");
		capitalCity.put("Norway", "Oslo");
		System.out.println(capitalCity.getOrDefault("USA", "DEFAULT"));
	}
}
