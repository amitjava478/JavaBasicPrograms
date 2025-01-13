package com.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchElementStartWithOne {

	public static void main(String[] args) 
	{

		List<Integer> list=new ArrayList<>(Arrays.asList(101,201,11,134,78,121));
		
  List<Integer> list2=		list.stream()
		//.filter(p->p.toString().startsWith("1"))
		  .filter(p->String.valueOf(p).startsWith("1"))
		.collect(Collectors.toList());
  
       System.out.println(list2);
       
       
	}

}
