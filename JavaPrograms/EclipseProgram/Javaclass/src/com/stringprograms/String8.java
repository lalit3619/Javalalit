package com.stringprograms;

public class String8 {

	public static void main(String[] args) {
	String s="MAdam";
//	System.out.println(s.toLowerCase());
//	System.out.println(s.toUpperCase());
//	System.out.println(s);
	System.out.println(IsPallindrome(s));
	

	}
     public static boolean IsPallindrome(String s)
 {
	s=s.toLowerCase();
	for(int i=0;i<s.length()/2;i++)
	{
		if(s.charAt(i)!=s.charAt(s.length()-i-1))
		{
			return false;
		}
	}
	return true;
		
}
}
