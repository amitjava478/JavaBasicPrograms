package com.java;

public class ReverseTheString1 {
	
	public static void main(String[] args) {
		
		String str="Hello World Amit";
		
		System.out.println(reverseTheString(str));
		
	}

	private static String reverseTheString(String str) {
		
		
		if(str.isEmpty())
		{
			return str;
		}
		
		return reverseTheString(str.substring(1))+str.charAt(0);
	}

}
