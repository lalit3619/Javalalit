package com.OOPSPrograms;

public class Testclass {
public static void main(String[] args) {
	Address adr=new Address("India", "UP", "Lucknow");
	Student1 s=new Student1("sita", 32, "computer", adr);
	s.displayinfo();
}
}
