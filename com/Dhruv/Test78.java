package com.Dhruv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test78 {

	public static void main(String[] args) 
	{
	


List<Integer> list=Arrays.asList(1,2,3,4,5);

      Double average=          list.stream()
                    .filter(p->p%2==0)
                    .mapToInt(p->p*2)
                    .average()
                    .orElse(0.0);
               System.out.println(average);

	}

}
