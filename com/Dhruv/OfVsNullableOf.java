package com.Dhruv;

import java.util.Optional;

public class OfVsNullableOf {

	public static void main(String[] args) {
		
		
		//Optional<String> optional=Optional.of(null);
		//Optional<String> optional=Optional.of("Hello Amit");
		//Optional<String> optional=Optional.ofNullable("Hello Amit");
		Optional<String> optional=Optional.ofNullable(null);
		
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}
		else
		{
			System.out.println("value is not there");
		}

	}

}
