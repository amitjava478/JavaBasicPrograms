package com.amit;

import java.util.Arrays;

public class MergerTwoSortedArray 
{

	public static void main(String[] args) {

		int a[] = { 12, 45, 78 };
		int b[] = { 1, 4, 8 };

		int length1 = a.length;
		int length2 = b.length;

		int n[] = mergedTwoSortedArray(a, b, length1, length2);

		System.out.println(Arrays.toString(n));

	}

	private static int[] mergedTwoSortedArray(int[] a, int[] b, int length1, int length2) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 0;
		int mergedArray[] = new int[a.length + b.length];

		while (i < length1 && j < length2) {
			if (a[i] <= b[j]) {
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
