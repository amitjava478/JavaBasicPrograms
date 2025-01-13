package com.java;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "anagram";
		String s2 = "nagrama";
		String s3 = "rat";
		String s4 = "cat";

		System.out.println(checkForAnagram(s1, s2));
		System.out.println(checkForAnagram(s3, s4));

	}

	private static boolean checkForAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}

}
