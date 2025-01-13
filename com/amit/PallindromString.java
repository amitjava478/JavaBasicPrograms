package com.amit;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) 
	{

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String orinalString = s;

		String reverse = "";

		String s1[] = s.split("");
		for (int i = s1.length-1; i >= 0; i--) {
			reverse = reverse + s1[i];
		}

		if (orinalString.equals(reverse.trim())) {
			System.out.println("Its a pallindrome String");
		} else {
			System.out.println("Not a pallindrome String");
		}

	}

}
