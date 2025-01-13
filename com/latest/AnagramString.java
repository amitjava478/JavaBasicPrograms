package com.latest;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1="anagram";
		String s2="nagrama";
		String s3="rat";
		String s4="cat";
		System.out.println(checkForAnagram(s1,s2));
		System.out.println(checkForAnagram(s3,s4));
		

	}

	private static boolean checkForAnagram(String s1, String s2) {
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();		
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		
		return Arrays.equals(a1, a2);
	}

}
