package com.java;

public class SwappingTwoStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		String s1="amit";
		String s2="yadav";
		
		System.out.println("Before Swapping"+" "+s1+" "+s2);
		
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping"+" "+s1+" "+s2);

	}

}
