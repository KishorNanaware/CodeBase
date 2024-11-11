package main;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse string 
		String inputStr="Kishor";
		String reversStr="";
		for(int i=0;i<inputStr.length();i++) {
			reversStr=inputStr.charAt(i)+reversStr;
			}
		System.out.println(inputStr+" "+reversStr);

	}

}
