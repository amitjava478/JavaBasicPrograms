package com.amit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> list=Arrays.asList(1,0,2,0,4,7,0,2);
	
	List<Integer> zeroAndNonzeroList=  Stream.concat(
	    		   list.stream().filter(p->p==0),
	    		   list.stream().filter(p->p!=0))
	    		   .collect(Collectors.toList());
	
	
	System.out.println(zeroAndNonzeroList);
	

	}

}
