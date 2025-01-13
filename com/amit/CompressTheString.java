package com.amit;

public class CompressTheString {

	public static void main(String[] args) {

		String s = "aaaAArtWWWWRTTTTTQWW";

		findCompressString(s);

	}

	private static void findCompressString(String s) {

		char a[] = s.toCharArray();

		char previousChar = a[0];
		int count = 1;

		StringBuilder compressString = new StringBuilder();

		for (int i = 1; i <=a.length-1; i++) 
		{

			char currentChar = a[i];
			if (previousChar == currentChar) 
			{
				count++;

			} else 
			{
				compressString.append(previousChar);
				if (count > 1) 
				{
					compressString.append(count);

				}

				previousChar = currentChar;
				count = 1;

			}

		}
		compressString.append(previousChar);
		if(count>1)
		{
			compressString.append(count);
			
			
		}
		
		System.out.println(compressString.toString());

	}
}