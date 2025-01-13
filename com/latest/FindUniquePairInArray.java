package com.latest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniquePairInArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 4, 7, 8, 9, 0 ,6,-1};

		int targetSum = 6;

		Integer b[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Set<Integer> seenNumber = new HashSet<>();
		Set<String> uniquePair = new HashSet<>();

		Arrays.stream(b).forEach(number -> {

			int complementNumber = targetSum - number;

			if (seenNumber.contains(complementNumber)) {
				int smaller = Math.min(complementNumber, number);
				int larger = Math.max(complementNumber, number);

				String pair = smaller + "," + larger;

				if (!uniquePair.contains(pair)) {
					uniquePair.add(pair);
					System.out.println("(" + pair + ")");
				}
			}
			seenNumber.add(number);
		});

	}

}
