package com.hitman.springapp03;

import org.springframework.stereotype.Component;

@Component

public class Student {
	String name;
	Address address;
	public Student(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	
	
		void studentInfo() {

System.out.println("Name of the student is : " +name);
System.out.println("Address of the student is  " +address.city+address.state); 
		}
	}
