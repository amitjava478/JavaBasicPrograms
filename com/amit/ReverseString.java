package com.amit;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Hello world welcome";

		String s1[] = s.split(" ");
		String reverse = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			reverse = reverse + s1[i]+" ";

		}
		System.out.println(reverse.trim());

	}

}
