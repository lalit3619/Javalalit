package com.pro1;

public class staticandnonstatic {
	String s;
	int a;
	static int b=12345;
	
	//Non Static method
	public void Demo() {
		System.out.println("B1="+b);
		s="lalit";
		System.out.println("s="+s);
	}
	//static method
	public static void demo1(staticandnonstatic s1)
	{
		String s="RAmesh";
		System.out.println(s1.s);
		System.out.println("B1="+b);
		System.out.println(s);
	}

	public static void main(String[] args) {
		staticandnonstatic s=new staticandnonstatic();
		s.s="ushduf";
		System.out.println(s);
		demo1(s);
	}

}
