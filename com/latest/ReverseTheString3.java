package com.latest;

import java.util.Scanner;

public class ReverseTheString3 {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String s1[] = str.split(" ");
		String reverse = " ";

		for (int i = 0; i <= s1.length - 1; i++) {
			reverse = reverse + revereTheString(s1[i]);
		}
		
		System.out.println(reverse.trim());

	}

	private static String revereTheString(String input) {

		String s1[] = input.split("");
		String reverse = " ";

		for (int i = s1.length - 1; i >= 0; i--) {
			reverse = reverse + s1[i];
		}
		return reverse;
	}

}
