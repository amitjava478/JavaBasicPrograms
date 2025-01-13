package com.amit;

public class MaxInArray2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 7, 23, 89, 2 };

		int max = a[0];

		for (int i = 0; i <= a.length - 1; i++) {
			if (max < a[i])
			{
				max = a[i];
			}
		}

		System.out.println("Max Value In Array" + " " + max);
	}

}
