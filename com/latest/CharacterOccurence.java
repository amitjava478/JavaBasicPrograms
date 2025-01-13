package com.latest;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		String s = "Hello World H";
		
	List<String> list=Arrays.asList(s.split(""));
	

Map<String, Long> count=	list.stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


count.forEach((key,value)->{
	System.out.println(key+" "+value);
});
	}

}
