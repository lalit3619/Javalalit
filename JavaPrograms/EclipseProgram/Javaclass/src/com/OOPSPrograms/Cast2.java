package com.OOPSPrograms;

public class Cast2 extends Cast1 {
	public void cast12() {
		System.out.println("Cast12 in Cast2");
	}
	public void cast14() {
		System.out.println("Cast14 in Cast2");
	}
	public static void main(String[] args) {
		//Upcasting in java
	Cast1 c=new Cast2();
	c.cast12();
     if(c instanceof Cast2) {
	   Cast2 c1=(Cast2)c;//Downcasting i java
	   c1.cast14();
   }
	}

}
