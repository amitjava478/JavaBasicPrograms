package com.java;

import java.util.Arrays;

public class SequenctialArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int b[]= {6,8,9,10};
		
		System.out.println(checkForSequenctialArray(a));
		System.out.println(checkForSequenctialArray(b));

	}

	private static boolean checkForSequenctialArray(int[] a) {
		
		Arrays.sort(a);
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]!=a[i-1]+1)
			{
				return false;
			}
		}
		return true;
	}

}
