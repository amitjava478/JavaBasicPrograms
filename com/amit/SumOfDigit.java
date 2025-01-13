package com.amit;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		System.out.println("enter a number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		for (; n > 0;) {
			int i = n % 10;
			sum = sum + (i);
			n = n / 10;

		}

		System.out.println("Sum of Digits" + " " + sum);

	}

}
