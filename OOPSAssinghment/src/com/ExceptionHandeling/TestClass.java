package com.ExceptionHandeling;

import java.util.Scanner;


/**
 * This is the test class used to define and check your own custom exception and throw it.
 * 
 *  @param args unused.
*/
public class TestClass {

	private static int age;
	static void validate() throws InvalidAgeException
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

		if(age < 18)  
			throw new InvalidAgeException("Invalid Age, You are not eligible to vote");  
		else  
			System.out.println("Welcome to vote");  
	}  
	
	/**
     * This is the main method used  to define your own custom exception and throw it.
     * 
     *  @param args unused.
    */
	public static void main(String[] args)
	{
		try
		{  
			validate();  
		}
		catch(Exception e)
		{
			System.out.println("Caught an Exception: \n "+e);
		}   
	}  

}
