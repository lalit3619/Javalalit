package com.pro1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	/*Box b=new Box();
	b.display();
	Box b1=new Box(5);
	b1.display();
	Box b2=new Box(2 ,4 , 6);
	b2.display();*/
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Value");
	int a=scn.nextInt();
	Box b1=new Box(a);
	b1.display();
	
	Nonstaticblock n=new Nonstaticblock();
	}

}
