package com.OOPSPrograms;

public class compiletimepoly {
	public static void Test1() {
		System.out.println("Test1 method");
	}
	public static void Test1(int a) {
		System.out.println("Test1 method with int args");
	}
	public static void Test1(double d) {
		System.out.println("Test1 method with double args");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Test1(34);
		Test1(373.82);
		Test1();
		System.out.println("Main Ends");
		
	}

}
