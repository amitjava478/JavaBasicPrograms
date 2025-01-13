package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDublicatesFromList2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("amit", "amit", "Anjali", "Dhruv", "balag"));

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();

			if (Collections.frequency(list, s) > 1) {
				iterator.remove();
			}
		}

		System.out.println(list);
	}

}
