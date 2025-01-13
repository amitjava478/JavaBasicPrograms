package com.latest;

import java.util.Arrays;

public class MergedTwoSortedArray {

	public static void main(String[] args) {

		int array1[] = { 10, 20, 30, 40, 50 };
		int array2[] = { 11, 21, 33, 44, 55 };

		int mergerArray[] = mergerTwoSortedArray(array1, array2);

		System.out.println(Arrays.toString(mergerArray));

	}

	private static int[] mergerTwoSortedArray(int[] array1, int[] array2) {

		int length1 = array1.length;
		int length2 = array2.length;

		int i = 0, j = 0, k = 0;

		int mergerArray[] = new int[length1 + length2];

		while (i < length1 && j < length2) {
			if (array1[i] <= array2[j]) {
				mergerArray[k++] = array1[i++];
			} else {
				mergerArray[k++] = array2[j++];
			}

		}

		while (i < length1) {
			mergerArray[k++] = array1[i++];
		}

		while (j < length2) {
			mergerArray[k++] = array2[j++];
		}

		return mergerArray;
	}

}
