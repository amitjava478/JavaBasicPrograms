package com.java;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 13, 1, 10 };
		int b[] = { 11, 21, 31, 12, 0, 9 };


		int length1 = a.length;
		int length2 = b.length;

	int c[]	=mergeTwoArray(a, b, length1, length2);
	
	System.out.println(Arrays.toString(c));

	}

	private static int[] mergeTwoArray(int[] a, int[] b, int length1, int length2) {
		
		Arrays.sort(a);
		Arrays.sort(b);

		int mergedArray[] = new int[length1 + length2];

		int i = 0, j = 0, k = 0;

		while (i < length1 && j < length2)
		{
			if (a[i] <= b[j]) 
			{
				mergedArray[k++] = a[i++];
			} else {
				mergedArray[k++] = b[j++];
			}
		}

		while (i < length1) {
			mergedArray[k++] = a[i++];
		}

		while (j < length2) {
			mergedArray[k++] = b[j++];
		}

		return mergedArray;
	}

}
