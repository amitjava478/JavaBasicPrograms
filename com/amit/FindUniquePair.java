package com.amit;

public class FindUniquePair {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 0, -1, 5, 7, 9 };

		int targetSum = 5;

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == targetSum) {
					System.out.println("index" + " " + i + "," + j + " " + " " + "(" + a[i] + "," + a[j] + ")");
				}
			}
		}

	}

}
