package com.stringprograms;

public class String4 {

	public static void main(String[] args) {
		String s="Java Developer";
		int count=getcount(s,'e');
		System.out.println("e="+count);
		System.out.println("v="+getcount(s,'v'));
		System.out.println("r="+getcount(s,'r'));
		
		//o/p e=3;
		    
	}
public static int getcount(String s,char c)
{
	return s.length()-s.replace(c+"", "").length();
}
}
