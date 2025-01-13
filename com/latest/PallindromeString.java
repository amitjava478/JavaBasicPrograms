package com.latest;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) 
	{

		System.out.println("Enter a String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s;
		String reverse="";
		//String m=s;
		String str[]=s.split("");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+str[i];
		}
		
		if(s1.equals(reverse.trim()))
		{
			System.out.println("Its a PallindormString");
		}
		else
		{
			System.out.println("Its Not a Pallindrome String");
		}
		
	}

}
