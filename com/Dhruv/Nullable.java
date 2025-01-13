package com.Dhruv;

import java.util.Optional;

public class Nullable {

	public static void main(String[] args) {
		
		String a[]=new String[10];
		
		//System.out.println(a[5].toLowerCase());
		
		a[5]="Hello amit";
		
	Optional<String> checkNull=	 Optional.ofNullable(a[5]);
	
	
	if(checkNull.isPresent())
	{
		String lowerCaseString=a[5].toLowerCase();
		System.out.println(lowerCaseString);
	}
	else
	{
		System.out.println("Value is not present");
	}

	}

}
