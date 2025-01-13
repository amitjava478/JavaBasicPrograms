package com.amit;

import java.util.Scanner;

public class PallindormNumber {

	public static void main(String[] args) {

		System.out.println("enter a number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = n;

		int sum = 0;

		for (; n > 0;) {
			int i = n % 10;
			sum = (sum * 10) + (i);
			n = n / 10;

		}

		if (m == sum) {
			System.out.println("its a pallindrome Number");

		} else {
			System.out.println("Not a pallindrome Number");
		}

	}

}
