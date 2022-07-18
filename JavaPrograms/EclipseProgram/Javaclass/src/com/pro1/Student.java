package com.pro1;

public class Student {
String name;
int age;
String sub;
//to intialise non atatic variable
public Student(String n,int a,String s)
{
	name=n;
	age=a;
	sub=s;
	}
public void display() {
	System.out.println("Name = "+name+ " Age =" +age+" Subject =" +sub);
	
}
public static void main(String[] args) {

	Student ms=new Student("Lalit", 62, "Bio");
	Student ms1=new Student("Smita", 30, "c++");
	ms.display();
	ms1.display();
}
}
