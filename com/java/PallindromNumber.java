package com.java;

import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int sum = 0;

		for (; n > 0;) {
			int i = n % 10;
			sum = (sum * 10) + i;
			n = n / 10;
		}

		if (sum == m) {
			System.out.println("Its a pallindome Number");
		} else {
			System.out.println("Its not a pallindome Number");
		}
	}

}
