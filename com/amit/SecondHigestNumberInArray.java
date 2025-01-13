package com.amit;

public class SecondHigestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,34,56,89,1};
		
		
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

		
		System.out.println(a[a.length-2]);
	}

}
