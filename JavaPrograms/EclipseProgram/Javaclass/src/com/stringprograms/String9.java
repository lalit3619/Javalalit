package com.stringprograms;

public class String9 {

	public static void main(String[] args) {
		String s="Java Developer";
		//o/p repoleveD avaj
		StringBuilder sb=new StringBuilder();
//		sb.append("and testing");
//		System.out.println(sb);
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}

}
