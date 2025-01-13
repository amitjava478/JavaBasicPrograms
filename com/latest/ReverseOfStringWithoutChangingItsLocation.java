package com.latest;

import java.util.Scanner;

public class ReverseOfStringWithoutChangingItsLocation {

	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reverse = "";

		String s1[] = str.split(" ");

		for (int i = 0; i <= s1.length - 1; i++) {

			reverse = reverse + " " + findReverse(s1[i]);
		}
		System.out.println(reverse.trim());

	}

	private static String findReverse(String str) {
		String s2[] = str.split("");
		String reverse = "";

		for (int i = s2.length - 1; i >= 0; i--) {
			reverse = reverse + s2[i];
		}

		return reverse;
	}

}
