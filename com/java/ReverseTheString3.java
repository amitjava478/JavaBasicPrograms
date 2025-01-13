package com.java;

public class ReverseTheString3 {

	public static void main(String[] args) {

		String str = "amit";

		String s1[] = str.split("");

		String reverse = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			reverse = reverse + s1[i];
		}

		System.out.println(reverse.trim());

	}

}
