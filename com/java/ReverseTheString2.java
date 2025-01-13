package com.java;

public class ReverseTheString2 {

	public static void main(String[] args) {

		String str = "Hello world amit";

		String s1[] = str.split(" ");

		String reverse = " ";

		for (int i = 0; i <= s1.length - 1; i++) {
			reverse = reverse +" "+ findReverse(s1[i]);
		}
		
		System.out.println(reverse.trim());

	}

	private static String findReverse(String input) {

		String str[] = input.split("");

		String reverse = "";

		for (int i = str.length - 1; i >= 0; i--) {
			reverse = reverse + str[i];
		}

		return reverse.trim();
	}

}
