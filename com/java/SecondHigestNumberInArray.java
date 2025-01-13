package com.java;

import java.util.Arrays;

public class SecondHigestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {10,23,45,78,90,110};
		
		Arrays.sort(a);
		
		System.out.println("Second Higest Number"+" "+a[a.length-2]);

	}

}
