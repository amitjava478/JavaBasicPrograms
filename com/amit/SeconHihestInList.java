package com.amit;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SeconHihestInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		List<Integer> list=List.of(12,45,78,23,90,23);
		
		Integer secondHigestNumber=          list.stream()
		          .sorted(Collections.reverseOrder())
		          .skip(1)
		          .findFirst()
		          .orElseThrow(null);
		
		
		System.out.println(secondHigestNumber);
		
		
	}

}
