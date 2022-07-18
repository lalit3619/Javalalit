package com.pro1;

public class Student1 {
String name;
int age;
String sub;
//to intialise non atatic variable
public Student1(String name,int age,String sub)
{
	name=name;
	age=age;
	sub=sub;
	}
public void display() {
	System.out.println("Name = "+name+ " Age =" +age+" Subject =" +sub);
	
}
public static void main(String[] args) {

	Student1 ms=new Student1("Lalit", 62, "Bio");
	Student1 ms1=new Student1("Smita", 30, "c++");
	ms.display();
	ms1.display();
}
}
