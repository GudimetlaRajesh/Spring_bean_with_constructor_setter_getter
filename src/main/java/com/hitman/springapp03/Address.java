package com.hitman.springapp03;
import org.springframework.stereotype.Component;

public class Address {
	String city;
	String state;
	public Address(String city, String state) {
		
		this.city = city;
		this.state = state;
	}
 
}
