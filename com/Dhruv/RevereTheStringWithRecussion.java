package com.Dhruv;

public class RevereTheStringWithRecussion {

	public static void main(String[] args) {
		
		String input="amit";
		System.out.println(reverseTheString(input));

	}

	private static String reverseTheString(String input) {

		if (input.isEmpty()) {
			return input;
		}

		return reverseTheString(input.substring(1)) + input.charAt(0);
	}

}
