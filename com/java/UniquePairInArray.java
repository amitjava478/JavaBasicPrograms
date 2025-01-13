package com.java;

public class UniquePairInArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,7,2,0};
		
		int targetNumber=6;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]+a[j]==targetNumber)
				{
					System.out.println(i+" "+j+" "+a[i]+","+a[j]);
				}
			}
		}

	}

}
