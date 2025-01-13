package com.amit;

import java.util.Scanner;

public class PallindromeString2 {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (isPallindome(s)) {
			System.out.println(s + " " + "is a pallindormString");
		} else {
			System.out.println(s + " " + "Not  a pallindormString");
		}

	}

	private static boolean isPallindome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) 
		{
			if (s.charAt(left) != s.charAt(right)) 
			{
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
