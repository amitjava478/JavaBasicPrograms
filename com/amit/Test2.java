package com.amit;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		
		String s="abcaaabcbbabcabc";
		
		String result=findLongestSubString(s);
		
		System.out.println(result);

	}

	private static String findLongestSubString(String s) {
		
		HashSet<Character> set=new HashSet<>();
		
		int left=0,right=0;
		int maxLength=0;
		String longestString="";
		
		while(right<s.length())
		{
			if(!set.contains(s.charAt(right)))
			{
				set.add(s.charAt(right));
				right++;
				if(right-left>maxLength)
				{
					maxLength=right-left;
					longestString=s.substring(left, right);
				}

			}
			else
			{
				set.remove(s.charAt(left));
				left++;
         			}
		}
		
		return longestString;
	}

}
