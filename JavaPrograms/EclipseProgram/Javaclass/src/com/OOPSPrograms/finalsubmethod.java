package com.OOPSPrograms;

public class finalsubmethod extends Finalwithmethod {
	//cant't override final method, but we can inherit
 	/*public void m1() {
		System.out.println("m1 method in sub-class");
	}*/
	public void m2() {
		System.out.println("m2 method in sub-class");
	}
	public static void main(String[] args) {
		finalsubmethod f=new finalsubmethod();
		f.m1();
	}

}
