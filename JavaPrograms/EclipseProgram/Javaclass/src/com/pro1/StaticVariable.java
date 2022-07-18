package com.pro1;

public class StaticVariable {
 
	static int a;//Static Variable using class NAme
	public static void Demo() {//static method
		a=565465;
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		System.out.println(a);
		a=1925632;
		System.out.println("a="+a);
		Demo();
		System.out.println("Main ends");

	}

}
