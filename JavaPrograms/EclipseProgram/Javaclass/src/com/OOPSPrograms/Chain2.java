package com.OOPSPrograms;

public class Chain2 extends Chain1 {
	//Constructor chaining in java
	//1.Implicit Constructor Chaining
	//2.Explicit Constructor Chaining 
	Chain2 (int a){
		super(a);//call to super
		System.out.println("Superchain2 Constructor a="+a);
	}
	public static void main(String[] args) {
		System.out.println("MAin Starts");
		Chain2 c=new Chain2(34);
		c.test1();
		System.out.println("Main ends");

	}

}
