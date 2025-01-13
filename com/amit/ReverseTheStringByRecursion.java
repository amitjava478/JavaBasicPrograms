package com.amit;

public class ReverseTheStringByRecursion {

	public static void main(String[] args) {

		String s = "Hello world";

		System.out.println(reverseTheString(s));

	}

	private static String reverseTheString(String s) {

		if (s.isEmpty()) {
			return s;

		}

		return reverseTheString(s.substring(1)) + s.charAt(0);
	}

}
