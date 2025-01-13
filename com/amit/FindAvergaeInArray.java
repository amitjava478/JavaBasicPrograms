package com.amit;

import java.util.Arrays;
import java.util.List;

public class FindAvergaeInArray {

	public static void main(String[] args) 
	{
	


List<Integer> list=Arrays.asList(1,2,3,4,5);

      Double average=          list.stream()
                    .filter(p->p%2==0)
                    .mapToInt(p->p*2)
                    .average()
                    .orElse(0.0);
               System.out.println(average);

	}}