package com.OOPSPrograms;

public class Address {

	String Country;
	String State;
	String City;
	public Address(String Country,String State, String City) {
		this.Country=Country;
		this.State=State;
		this.City=City;
		
	}
	public void display() {
		System.out.println("[Country="+Country+",State="+State+",City="+City+"]");
	}
	
}
