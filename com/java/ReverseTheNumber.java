package com.java;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (; n > 0;) {
			int i = n % 10;
			sum = (sum * 10) + i;
			n = n / 10;
		}

		System.out.println("Reverse is" + " " + sum);

	}

}
