package com.java;

public class CompressTheString {

	public static void main(String[] args) {
		
		
		String s="aaaBhjkuuutyweTTttttta";
		
		System.out.println(compressTheString(s));

	}

	private static String compressTheString(String s) {
		
		
		char a[]=s.toCharArray();
		
		 char previousChar=a[0];
		 int count=1;
		 
		 StringBuilder compressString=new StringBuilder();
		 
		 for(int i=1;i<=a.length-1;i++)
		 {
			 char currentChar=a[i];
			 if(previousChar==currentChar)
			 {
				 count++;
			 }
			 else
			 {
				 compressString.append(previousChar);
				 if(count>1)
				 {
					 compressString.append(count);
				 }
				 
				 count=1;
				 previousChar=currentChar;
				 
			 }
		 }
		 
		 compressString.append(previousChar);
		 if(count>1)
		 {
			 compressString.append(count);
		 }
		
		return compressString.toString();
	}

}
