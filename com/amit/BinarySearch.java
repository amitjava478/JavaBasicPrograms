package com.amit;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int array[] = {10, 20, 30, 40, 50 };

		System.out.println("Enter a number for serach");

		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();

		int result = findElementOnArray(array, target);

		if (result == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at" + " " + result);
		}
	}

	private static int findElementOnArray(int[] array, int target) {

		int left = 0;
		int right = array.length - 1;

		while (left <= right)
		{
			int mid = left + (right - left) / 2;
			
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target)// if target is smaller ,ignore the right half
			{
				right = mid - 1;
			} else // if target is larget,ignore the left half
			{
				left = mid + 1;
			}
		}
		// if target is not present
		return -1;
	}

}
