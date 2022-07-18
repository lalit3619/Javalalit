package com.pro1;

public class Programflow {
public static void m1()
{
	m2();
	System.out.println("m1 completed");
}
 static void m2()
{

	System.out.println("m2 completed");
}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");

	}

}
