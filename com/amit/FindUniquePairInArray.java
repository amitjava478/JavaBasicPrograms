package com.amit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniquePairInArray {

	public static void main(String[] args) {

		Integer a[] = { 2, 3, 4, 6, 7, 0, -1,5, 1 };

		Integer tagetSum = 6;
		Set<Integer> seenNumber = new HashSet<>();
		Set<String> uniquePair = new HashSet<>();

		Arrays.stream(a).forEach(number -> {

			int complement = tagetSum - number;

			if (seenNumber.contains(complement)) {
				int larger = Math.max(number, complement);
				int smaller = Math.min(number, complement);
				String pair = smaller + "," + larger;

				if (!uniquePair.contains(pair)) {
					uniquePair.add(pair);
					System.out.println("unique Pair" + " " + "(" + pair + ")");
				}

			}
seenNumber.add(number);
		});

	}

}
