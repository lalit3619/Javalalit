package com.stringprograms;

public class String3 {

	public static void main(String[] args) {
		String s1="java developer";
		String s2=" ";
		//o/p repoleved avaj
//		char c= s1.charAt(9);
//		System.out.println(c);
//		System.out.println(s1.charAt(12));
//		System.out.println(s1.length());
		int n=s1.length();
			for(int i=n-1;i>=0;i--)
			{
				char c=s1.charAt(i);
				s2=s2+c;
			}
				System.out.println("Reversed String="+s2);
	}

}
