package com.latest;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int m=n;
		
		int sum=0;
		
		
		for(;n>0;)
		{
			int i=n%10;
			sum=sum+(i*i*i);
			 n=n/10;
			
		}
		if(sum==m)
		{
			System.out.println("Its a armstrong number");
		}else
		{
			System.out.println("Its not a armstrong number");
		}

	}

}
