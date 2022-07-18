package com.OOPSPrograms;

public class Student1 {
String name;
int age;
String sub;
Address adr;
public Student1(String name,int age,String sub,Address adr) {
	this.name=name;
	this.age=age;
	this.sub=sub;
	this.adr=adr;
	}
public void displayinfo()
{
	System.out.println("[Name="+name+",Age="+age+",Subject="+sub+"]");
	adr.display();
}
}
