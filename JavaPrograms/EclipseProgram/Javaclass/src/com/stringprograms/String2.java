package com.stringprograms;

public class String2 {

	public static void main(String[] args) {
      String s=new  String("ABCD");
      String s1="abcd";
      String s2="abcd";
      System.out.println(s==s1);
      System.out.println(s1==s2);
      System.out.println(s.equals(s1));
	}

}
