package com.pro1;

public class statnonstat {
int a;
int b;
static String dul;
public static void m1() {
	System.out.println("Dul="+dul);
	
}
public void  m2() {
	System.out.println("m2 method a="+a+",b="+b);
}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		statnonstat s=new statnonstat();
		s.m2();
		
	}

}
