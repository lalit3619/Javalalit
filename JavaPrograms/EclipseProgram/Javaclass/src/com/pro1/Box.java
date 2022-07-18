package com.pro1;

public class Box {
	int length;
	int breadth;
	int height;
	
	//constructors
	Box(){
		
	}
	Box(int l,int b,int h)
	{   
		length=l;
		breadth=b;
		height=h;
		
	}
	Box(int l)
	{
		length=breadth=height=l;
	}
	public void display() {
		System.out.println("Length="+length+",Breadth="+breadth+",Height="+height); 
	}

}
