package com.amit;

public class Test674 {
    static	int a = 10;
    static    int b = 10;

	public static void main(String[] args) {

		

		sum(a, b);

		System.out.println(a + " " + b);

		Integer a1 = 10;
		Integer b1 = 10;

		sum(a1, b1);

		System.out.println(a1 + " " + b1);

	}

	public static void sum(int a1, int b1) {
		System.out.println("primtive called");
		 a=a1+10;
		 b=b1+10;
	}

	public static void sum(Integer a1, Integer b1) {
		System.out.println("wrapper called");
		
		a=a1+10;
		b=b1+10;
	}

}
