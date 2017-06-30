package com.tasnim.java;

public class Person {
	String name;
	int age;
	int phoneNumber;
	
	public Person() {
		
	}
	
	public Person(String yourName, int yourAge, int yourPhoneNumber) {
		name = yourName;
		age = yourAge;
		phoneNumber = yourPhoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String yourName) {
		name = yourName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int yourAge) {
		age = yourAge;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int yourPhoneNumber) {
		phoneNumber = yourPhoneNumber;
	}
	
	public void display() {
		System.out.println("Hello " + name + ", your age is " + age + " and your phone number is " + phoneNumber+ ". Thank you.");
	}
	
	
}
