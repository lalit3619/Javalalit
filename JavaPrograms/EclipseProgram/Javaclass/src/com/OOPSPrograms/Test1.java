package com.OOPSPrograms;

public class Test1 {

	public static void main(String[] args) {
		
   C c1=new C();
   c1.m2();
  B b=new B();
  b.m1();
  A a=new A();
  a.m1();
   
	}

}
class A{
	public void m1()
	{
		System.out.println("M1 method");
	}
}
class B extends A{
	public void m2()
	{
		System.out.println("M2 method");
	}
}
class C extends B{
	public void m3()
	{
		System.out.println("M3 method");
	}
}