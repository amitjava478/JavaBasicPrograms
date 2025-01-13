package com.latest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigestInList {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(12,45,89,34,90);
		
		       Collections.sort(list);
		       System.out.println(list);
		       
		       System.out.println("Second Higest Number"+" "+list.get(list.size()-2));
		
	}

}
