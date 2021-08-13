package com.HashMap;

import java.util.HashMap;



/**
 * Problem Statement:  Write a program to copy all of the elements from the one map to another map.
 * 
 * @author bthombre
 *
 */
public class CopyHM {

	/**
     * This is the main method used  to  copy all of the elements from the one map to another map.
     * 
    */
	public static void main(String[] args) {
	     // Create a instance  HashMap
	     HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	     //add elements to HashMap
	     hashmap.put(1, "AA");
	     hashmap.put(2, "BB");
	     hashmap.put(3, "CC");
	     hashmap.put(4, "DD");
	 
	     // Create another HashMap
	     HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();
	 
	     // Adding elements to the recently created HashMap
	     hashmap2.put(11, "Hello");
	     hashmap2.put(22, "Hi");
	 
	     // Copying one HashMap "hmap" to another HashMap "hmap2"
	     hashmap2.putAll(hashmap);
	 
	     // Displaying HashMap "hmap2" content
	     System.out.println("HashMap 2 contains: "+ hashmap2);
	  }
}
