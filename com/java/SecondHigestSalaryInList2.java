package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigestSalaryInList2 {
	
	
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(12,23,78,90,34);
	
Integer secondHigestNumber=	list.stream()
	.sorted(Collections.reverseOrder())
	.skip(1)
	.findFirst()
	.orElseThrow(null);


System.out.println(secondHigestNumber);


}

}
