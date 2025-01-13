package com.latest;

public class CompressTheString {

	public static void main(String[] args) {

		String s = "AbAAABGJgdtrettt";

		compressString(s);

	}

	private static void compressString(String s) {

		char a[] = s.toCharArray();
		char previousChar = a[0];
		int count = 1;
		StringBuilder compessString = new StringBuilder();
		
		for (int i = 1; i <= a.length - 1; i++) {

			char currentChar = a[i];
			if (previousChar == currentChar) {
				count++;

			} else {
				compessString.append(previousChar);
				if (count > 1) {
					compessString.append(count);
					
				}
				previousChar = currentChar;
				count = 1;
			}
		}
		compessString.append(previousChar);
		if (count > 1) {
			compessString.append(count);
		
		}

		System.out.println(compessString.toString());
	}

}
