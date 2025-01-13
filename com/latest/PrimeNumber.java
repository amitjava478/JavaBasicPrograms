package com.latest;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Its a prime Number");
		}
		else
		{
			System.out.println("Not a prime Number");
		}
		
	}

}
