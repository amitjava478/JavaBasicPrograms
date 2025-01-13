package com.latest;

public class FindUniquePair {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 4, 6, 8, 9, 5,6,-1,7};
		int targetSum = 6;

		for (int i = 0; i <= a.length - 1; i++)

		{
			for (int j = i + 1; j <= a.length - 1; j++)
			{
				if (a[i] + a[j] == targetSum) 
				{
					System.out.println("unique Pair" + i + "," + j + " And Value are " + a[i] + "," + a[j]);
				}
			}
		}

	}

}
