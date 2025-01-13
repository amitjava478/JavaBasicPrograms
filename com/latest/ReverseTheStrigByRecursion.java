package com.latest;

import java.util.Scanner;

public class ReverseTheStrigByRecursion {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(ReverseTheString(str));
		

	}

	private static String ReverseTheString(String str) {
		
		if(str.isEmpty())
		{
			return str;
		}
		
		return ReverseTheString(str.substring(1))+str.charAt(0);
	}

}
