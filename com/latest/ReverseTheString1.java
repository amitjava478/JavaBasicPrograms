package com.latest;

import java.util.Scanner;

public class ReverseTheString1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
	
		String s1[]=str.split(" ");
		String reverse="";
		
		for(int i=s1.length-1;i>=0;i--)
		{
			reverse=reverse+" "+s1[i];
		}

		System.out.println(reverse.trim());
	}

}
