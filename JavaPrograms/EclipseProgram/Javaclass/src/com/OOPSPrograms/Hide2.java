package com.OOPSPrograms;

public class Hide2 extends Hide1 {
	// Method Hiding in java using static method
	public static void m1() {
		System.out.println("M1 in Hide2");
	}
	public static void m2() {
		System.out.println("M2 in Hide2");
	}
	public static void m3() {
		System.out.println("M3 in Hide2");
	}
	public static void main(String[] args) {
		Hide2 h=new Hide2();
		h.m1();
		
	}
}
