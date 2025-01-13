package com.java;

public class MaxInArray2 {

	public static void main(String[] args) {

		int a[]= {12,34,89,45,90};
		
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Max In Array"+" "+max);
		
	}

}
