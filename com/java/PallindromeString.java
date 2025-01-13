package com.java;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		String s1[]=str.split("");
		
		String reverse="";
		
		for(int i=s1.length-1;i>=0;i--)
		{
			reverse=reverse+s1[i];
		}
		
		if(str.equals(reverse.trim()))
		{
			System.out.println("Pallindrome String");
		}
		else
		{
			System.out.println("Not Pallindrome String");
		}

	}

}
