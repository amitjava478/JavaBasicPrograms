package com.latest;

import java.util.Arrays;

public class SecondHigestInArray2 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 34, 1, 20 };

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
	
		System.out.println(Arrays.toString(a));
		System.out.println("Second Higest Nunber"+" "+a[a.length-2]);
		
		
		
	}

}
