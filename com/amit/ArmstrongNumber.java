package com.amit;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("enter a number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = n;

		int sum = 0;

		for (; n > 0;) {
			int i = n % 10;
			sum = sum + (i * i * i);
			n = n / 10;

		}

		if (sum == m) {
			System.out.println("its a armstrong number");
		} else {
			System.out.println("its not a armstrong number");
		}

	}

}
