package com.latest;

public class ReverseTheStringWithRecursion {

	public static void main(String[] args) {
		
		String s="Hello World Welcome";
		
		System.out.println(reverseTheString(s));
		

	}

	private static String reverseTheString(String s) {
		
		if(s.isEmpty())
		{
			return s;
		}
		
		return reverseTheString(s.substring(1))+s.charAt(0);
	}

}
