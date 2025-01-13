package com.java;

import java.util.Arrays;

public class SecondHigestNumberInArray1 {

	public static void main(String[] args) {

		int a[] = { 10, 23, 45, 78, 90, 110, 11 };

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
        System.out.println("Sorted Values"+" "+Arrays.toString(a));
		System.out.println("Second Higest Number In Array" + " " + a[a.length - 2]);
	}

}
