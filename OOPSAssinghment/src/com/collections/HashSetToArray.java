package com.collections;

import java.util.HashSet;

/**
 * Problem Statement:  Write a program to copy elements from HashSet to Array.
 * 
 * @author bthombre
 *
 */
public class HashSetToArray {
	/**
	 * This is the main method used to copy elements from HashSet to Array.
	 * 
	 */
	public static void main(String a[]){
		
		HashSet<String> hashset = new HashSet<String>();
		
		//add elements to HashSet
		hashset.add("first");
		hashset.add("second");
		hashset.add("third");
		
		System.out.println("HashSet content: ");
		System.out.println(hashset);
		
		// copy element to array
		String[] strArr = new String[hashset.size()];
		hashset.toArray(strArr);
		System.out.println("Copied array content:");
	
		// foreach loop to iteration
		for(String str:strArr){
			System.out.println(str);
		}
	}
}
