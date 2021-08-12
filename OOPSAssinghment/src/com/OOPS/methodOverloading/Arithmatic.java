package com.OOPS.methodOverloading;



/**
 * Problem Statement: Write a program to demonstrate method overloading.
 * 
 * @author bthombre
 *
 */
public class Arithmatic {

	// initialisation sum method with one integer parameter.
	void sum(int a) {
		System.out.println(a + a);
	}
	
	// initialisation sum method with one double parameter.
	void sum(double a) {
		System.out.println(a + a);
	}
	
	// initialisation sum method with two double parameter.
	void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	// initialisation sum method with two sum parameter.
	int sum(int a, int b) {
		return a+b;
	}
	
	// initialisation sum method with  one int and one double parameter.
	void sum(int a, double b) {
		System.out.println(a + b);
	}
	
	// initialisation sum method with one double and one int parameter.
	void sum(double a, int b) {
		System.out.println(a + b);
	}
}
