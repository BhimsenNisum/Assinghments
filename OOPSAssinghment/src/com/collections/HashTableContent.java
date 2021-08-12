package com.collections;

import java.util.Hashtable;

/**
 * Problem Statement:  Write a program to display HashTable content.
 * 
 * @author bthombre
 *
 */
public class HashTableContent {

	/**
     * This is the main method used  display HashTable content.
     * 
     *  @param args unused.
    */
	public static void main(String[] args) {

		/* HashTable  Declaration */
		Hashtable<Integer, String> hashtable1 = new Hashtable<>();
		hashtable1.put(1, "one");
		hashtable1.put(2, "two");
		hashtable1.put(3, "three");

		/* HashTable  Declaration */
		Hashtable<Integer, String> hashtable2 = new Hashtable<Integer, String>();
		hashtable2.put(4, "four");
		hashtable2.put(5, "five");
		hashtable2.put(6, "six");

		
		System.out.println("Mappings of hashtable1 : " + hashtable1);
        System.out.println("Mappings of hashtable2 : " + hashtable2);
	}

}
