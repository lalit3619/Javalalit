package com.pro1;

public class Nonstaticblock { 
	int a;
	static {
		System.out.println("Static block");
	}
	public Nonstaticblock() {
		System.out.println("Constructor");
	}
	
	{
		a=46954;
		System.out.println("Non static block1 a= " +a);
	}
	{
		System.out.println("Non static block2");
	}
	{
		System.out.println("Non static block3 ");
	}
	public static void main(String[] args) {
		Nonstaticblock n=new Nonstaticblock();
		System.out.println("Main statrts");
		System.out.println("Main Ends");
	}

}
