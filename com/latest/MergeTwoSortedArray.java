package com.latest;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int a[]= {10,23,45,89};
		int b[]= {23,34,67};
				
			
	int c[]=MergeTwoSortedArray(a,b);
	System.out.println(Arrays.toString(c));

	}

	private static int [] MergeTwoSortedArray(int[] a, int[] b) {
		
		int length1=a.length;
		int length2=b.length;
		int i=0,j=0,k=0;
		
		int mergerArray[]= new int[length1+length2];
		
		while(i<length1 && j<length2)
		{
			if(a[i]<=b[j])
			{
				mergerArray[k++]=a[i++];
			}
			else
			{
				mergerArray[k++]=b[j++];
			}
		}
		
		
		while(i<length1)
		{
			mergerArray[k++]=a[i++];
		}
		
		while(j<length2)
		{
			mergerArray[k++]=b[j++];
		}
		
		
		
		return mergerArray;
	}

}
