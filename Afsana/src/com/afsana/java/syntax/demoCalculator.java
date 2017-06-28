package com.afsana.java.syntax;

public class demoCalculator {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();
		
		c1.performAddition(2, 3);
		c2.performAddition(2, 4, 1, 3);
		c3.performAddition(2.2f, 3.3f);

	}

}
