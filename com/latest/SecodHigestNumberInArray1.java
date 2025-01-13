package com.latest;

import java.util.Arrays;

public class SecodHigestNumberInArray1 {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,56,2,45};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("Second Higest Number"+" "+a[a.length-2]);
		
	}

}
