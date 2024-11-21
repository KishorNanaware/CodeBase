package main;
import java.util.HashMap;
import java.util.Map;
public class FrequencyOfWords {

	public static void main(String[] args) {
		// Use of HashMap with Get Default 
		String [] words = {"Kishor","Vijay","Vijay","Ganesh","Harshu","Vijay"};
		Map<String,Integer> frequencyMap=new HashMap<String, Integer>();
		for(String str:words) {
			int count=frequencyMap.getOrDefault(str, 0)+1;
			frequencyMap.put(str, count);
		}
    System.out.println(" "+frequencyMap);
	}
}
