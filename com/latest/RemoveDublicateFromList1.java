package com.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDublicateFromList1 {

	public static void main(String[] args) 
	{
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,88,99,99,20));
		
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext())
		{
			Integer i=it.next();
			
			if(Collections.frequency(list, i)>1)
			{
				it.remove();
			}
			
			
		}

		System.out.println(list);
	}

}
