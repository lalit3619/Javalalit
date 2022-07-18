package com.pro1;

public class Thirdmember {
	//Third member of a class--- Constractor in Java
	//Syntax to create 
	
	//Default Constructor
	public Thirdmember() {
		//Constructor
		System.out.println("Constructor in java");
	}
	public Thirdmember(int i) {
		//Constructor
		System.out.println("Constructor in java i="+i);
	}
int a;//Variables 
void m1()
{
	
}
 
	public static void main(String[] args) {
	Thirdmember tm=new Thirdmember();	
	//tm.m1();
	Thirdmember tm1=new Thirdmember(98);	
    tm1.m1();//User
	}

}
