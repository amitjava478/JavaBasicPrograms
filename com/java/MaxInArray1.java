package com.java;

public class MaxInArray1 {

	public static void main(String[] args) {

		int a[] = { 12, 34, 89, 45, 90 };
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		}
		
		System.out.println("Max In Array"+" "+a[a.length-1]);
		
	}

}
