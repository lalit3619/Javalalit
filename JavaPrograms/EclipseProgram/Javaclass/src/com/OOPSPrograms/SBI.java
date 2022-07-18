package com.OOPSPrograms;

public class SBI extends RBI {//inheritance in java //parent child or is a relationship
	// SIngle Inheritance
	//Method Overriding in java
	//1. Method name should be same
	//2. Return type should be same
	//public>protected>default>private
	// Calling Method
	// Method Implementation
	public void loan_Interest()
	{
		System.out.println("Loan intrst= 9.2%");
		
	}

	public static void main(String[] args) {
		SBI s=new SBI();
		s.loan_Interest();//Called Method
		//Binding In java
		//1. Compiler and JRE
	}

}
