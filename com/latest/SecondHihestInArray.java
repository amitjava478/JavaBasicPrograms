package com.latest;

import java.util.Arrays;

public class SecondHihestInArray {

	public static void main(String[] args)
	{
      
	int a[]= {1,20,45,89,23,90};
	
	Arrays.sort(a);
	
	for(int i : a) 
	{
		System.out.println(i);
	}
	
	System.out.println("Second Higest Number"+" "+a[a.length-2]);
		
	}

}
