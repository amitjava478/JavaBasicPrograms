package com.amit;

public class ReverseStringWithoutChangingWorldLocation {

	public static void main(String[] args) {

		String s = "Hello world welcome";

		String s1[] = s.split(" ");

		for (int i = 0; i <= s1.length - 1; i++) {
			System.out.print(reverseTheString(s1[i]));

			if (i < s1.length - 1) {
				System.out.print(" ");
			}
		}

	}

	private static String reverseTheString(String input) {

		String a[] = input.split("");
		String reveres = "";

		for (int i = a.length - 1; i >= 0; i--) {
			reveres = reveres + a[i];
		}

		return reveres;
	}

}
