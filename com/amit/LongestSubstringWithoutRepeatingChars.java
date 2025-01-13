package com.amit;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {

	public static String findLongestSubstring(String s) {
		// HashSet to store characters of the current substring
		HashSet<Character> set = new HashSet<>();

		// Pointers to track the current window
		int left = 0, right = 0;
		int maxLength = 0;
		String longestSubstring = "";

		while (right < s.length()) 
		{
			if (!set.contains(s.charAt(right))) {
				// Expand the window by adding the current character to the set
				set.add(s.charAt(right));
				right++;
				// Check if the current window is the longest so far
				if (right - left > maxLength) {
					maxLength = right - left;
					longestSubstring = s.substring(left, right);
				}
			} else {
				// Shrink the window by removing the leftmost character
				set.remove(s.charAt(left));
				left++;
			}
		}

		return longestSubstring;
	}

	public static void main(String[] args) {
		String input = "abcabcbb";
		String result = findLongestSubstring(input);
		System.out.println("The longest substring without repeating characters is: " + result);
	}
}
