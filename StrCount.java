package main;

public class StrCount {

	public static void main(String[] args) {
		// Create a function that accepts a string and a single character, and returns
		//an integer of the count of occurrences the 2nd argument is found in the first one.
         int count=strCount("Hello",'l');
         System.out.println("----Count------"+count);
	}

	private static int strCount(String inputStr, char c) {
		return (int)inputStr.chars()
				.filter(i->i==c)
				.count();
	}

}
