package com.amit;

import java.util.Arrays;

public class SequentialArray {

	public static void main(String[] args)
	{
		
		
		int a[]= {1,2,4,3,5};
		int b[]= {10,11,4,3,5};
		
		System.out.println(checkForSquential(a));
		System.out.println(checkForSquential(b));
		
	}

	private static boolean checkForSquential(int[] array) {
		
		
		Arrays.sort(array);
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[i-1]+1)
			{
				return false;
			}
		}
		
		return true;
	}

}
