package com.java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {

		String s = "abcabcabb";

		System.out.println(finSubString(s));

	}

	private static String finSubString(String s) {

		Set<Character> set = new HashSet<>();

		int left = 0, right = 0;
		String longestSubString = "";
		int maxLength = 0;

		while (right < s.length())
		{
			if (!set.contains(s.charAt(right))) 
			{
				set.add(s.charAt(right));
				right++;

				if (right - left > maxLength) 
				{
					maxLength = right - left;
					longestSubString = s.substring(left, right);
				}
			}
			else {

				set.remove(s.charAt(left));
				left++;
			}
		}

		return longestSubString;
	}

}
