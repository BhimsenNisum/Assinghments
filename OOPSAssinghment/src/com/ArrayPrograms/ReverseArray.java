package com.ArrayPrograms;


/**
 * Problem Statement: Write a program to reverse the array.
 * 
 * @author bthombre
 *
 */

public class ReverseArray {

	/**
	 * This is the main method used  to  remove an element from array.
	 * 
	 *  @param args unused.
	 */

	public static void main(String[] args) {

		// initialisation of array
		Integer[] intArray = {10,20,30,40,50,60,70,80,90};


		System.out.println("Original Array:");
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i] + "  ");

		System.out.println();


		System.out.println("Original Array printed in reverse order:");
		for(int i=intArray.length-1;i>=0;i--)
			System.out.print(intArray[i] + "  ");
	}
}
