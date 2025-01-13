package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDublicatesFromList1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 88, 99, 99, 20));

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer it = iterator.next();

			if (Collections.frequency(list, it) > 1) {
				iterator.remove();
			}
		}

		System.out.println(list);
	}

}
