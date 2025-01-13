package com.latest;

public class MaxInArray {

	public static void main(String[] args) {
		
		
		int a[]= {12,34,78,23,67,200,12};
		
		int max=a[0];
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Max Element In Array "+max);

	}

}
