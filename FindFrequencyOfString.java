package myPack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindFrequencyOfString {

	public static void main(String[] args) {
		List<String> inputString = new ArrayList<String>();
    		 inputString.add("vijay");
         inputString.add("Rohan");
         inputString.add("vijay");
         inputString.add("Rohan");
         inputString.add("vijay");
         inputString.add("Rohan");
         inputString.add("vijay");
         inputString.add("Ganesh");

         System.out.println("vijay Word frequency "+Collections.frequency(inputString,"vijay"));
         
	}

}
