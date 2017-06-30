package com.tasnim.java;

/**
 * I just wrote a big code. I know its not that big. Still I always love progress. So cheers!
1. There is a package declaration and that is com.tasnim.java
2. There are two classes, Person and ExecutePerson.
3. There are three fields in the class Person as name, age and phoneNumber.
4. There are two constructors in the class Person, one is a default constructor and the other is a parameterized one.
5. There are getters and setters in the class Person for the fields.
6. There is a method named display in the class Person which prints the fields.
7. In the class ExecutePerson, I have written a main method. I have created two instances, where I didnt pass any constructor argument in the first one, but in the second one I actually did pass the arguments.
In the first one, I passed value in the fields through setters.
Then I called the print method of the two objects.
Yay Mimi! 
Learning :) 
 * @author Afsana
 *
 */

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
