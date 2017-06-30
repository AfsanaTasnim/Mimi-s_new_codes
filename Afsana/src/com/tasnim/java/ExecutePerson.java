package com.tasnim.java;

public class ExecutePerson {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		Person p2 = new Person("Afsana", 25, 123456);
		
		p1.setName("Mike");
		p1.setAge(40);
		p1.setPhoneNumber(654321);
		
		p1.display();
		p2.display();
		
		

	}

}
