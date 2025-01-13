package com.latest;

import java.util.Scanner;

public class ReverseTheString2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println(reverse.trim());
	
	}

}
