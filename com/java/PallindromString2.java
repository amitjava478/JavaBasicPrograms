package com.java;

import java.util.Scanner;

public class PallindromString2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println(checkPallindromeString(str));
		
	}

	private static boolean checkPallindromeString(String str) {
		
		
		int left=0;
		int right=str.length()-1;
		
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

}
