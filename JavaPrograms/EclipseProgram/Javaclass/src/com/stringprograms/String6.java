package com.stringprograms;

public class String6 {
public static void main(String[] args) {
	String s="Java Developer";
	String s1="";
	//o/p=jav Devlopr
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(s1.indexOf(c)==-1)
		{
			s1=s1+c;
		}
	}
	System.out.println("Unique character="+s1);
	}
}
