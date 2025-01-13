package com.latest;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String s1[] = str.split(" ");
		String reverse = "";

		for (int i = s1.length - 1; i >= 0; i--) {
		//	for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse +" "+ s1[i];
			//reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse.trim());

	}

}
