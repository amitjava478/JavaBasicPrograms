package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelsIndices {

	public static void main(String[] args)
	{
		
		String s="Hello World";
		
		List<String> vowelsList=new ArrayList<String>(Arrays.asList("A","a","I","i","O","o","E","e","U","u"));
		
		
List<Integer>	vowelIndices=	IntStream.range(0,s.length())
		.filter(i->vowelsList.contains(String.valueOf(s.charAt(i)))).boxed()
		.collect(Collectors.toList());
		

System.out.println(vowelIndices);
		
	}

}
