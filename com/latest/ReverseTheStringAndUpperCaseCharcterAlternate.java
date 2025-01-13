package com.latest;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheStringAndUpperCaseCharcterAlternate {

	public static void main(String[] args) {

		System.out.println("Enter a string");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String reverString = new StringBuilder(str).reverse().toString();

		//System.out.println(reverString);

		String result = IntStream.range(0, reverString.length())
				.mapToObj(i -> i % 2 == 0 ? Character.toString(Character.toUpperCase(reverString.charAt(i)))
						: Character.toString(reverString.charAt(i)))
				.collect(Collectors.joining());

		System.out.println(result);

	}

}
