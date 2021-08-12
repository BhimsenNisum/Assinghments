package com.collections;

import java.util.Stack;

/**
 * Problem Statement:   Write a program to Implement push() and pop() on Stack.
 * 
 * @author bthombre
 *
 */
public class PushPop {

	
	/**
     * This is the main method used  Implement push() and pop() on Stack.
     * 
    */
	public static void main(String[] args) {

	    // create an object of Stack class
	    Stack<String> city = new Stack<>();

	    // push elements to top of stack
	    city.push("Mumbai");
	    city.push("Pune");
	    city.push("Nagpur");
	    city.push("Hyderabad");
	    city.push("Delhi");
	    System.out.println("Stack: " + city);

	    // pop element from top of stack
	    city.pop();
	    System.out.println("Stack after pop: " + city);
	    }
}
