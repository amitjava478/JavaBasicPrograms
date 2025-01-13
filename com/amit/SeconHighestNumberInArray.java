package com.amit;

import java.util.Arrays;

public class SeconHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,34,56,89,1};
		
		Arrays.sort(a);
		
		
		System.out.println(a[a.length-2]);
		
	}

}
