package com.pro1;

public class LocalVariablesinjava {

	public static void m1() {
		int a=1000;//Local variable
		System.out.println("a="+a);
	}
	
	public static void main(String[] args) {
		System.out.println("Starts Main");
		m1();
		System.out.println("Ends Main");
	}

}
