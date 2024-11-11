package Src;

import java.util.Arrays;

public class StrAnagrame {
	public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
        char[] aArray= a.toLowerCase().toCharArray();
        char[] bArray= b.toLowerCase().toCharArray();
        Arrays.sort(bArray);
        Arrays.sort(aArray);
        if(Arrays.equals(aArray, bArray)) {
        	System.out.println("anagram");
        }
	}
}
