package main;
import java.util.Arrays;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {
		String nameArry[]={"", "Sandesh", "Kishor", "OK","PK"};
        List<String> strList= Arrays.asList(nameArry);
        strList.stream().sorted();
        for(String s :strList) {
        	System.out.println("Using  sort "+s);
        }
        
	}

}
