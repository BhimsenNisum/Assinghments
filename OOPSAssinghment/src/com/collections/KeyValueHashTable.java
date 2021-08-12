package com.collections;

import java.util.Hashtable;

/**
 * Problem Statement:  Write a program to search key & value from HashTable.
 * 
 * @author bthombre
 *
 */
public class KeyValueHashTable {

	/**
     * This is the main method used search key & value from HashTable.
     * 
    */
	public static void main(String[] args) {
		
		// create an object of Hashtable and adding elements
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("1","First");
        hashtable.put("2","Second");
        hashtable.put("3","Third");
        hashtable.put("4","Forth");
        hashtable.put("5","Fifth");
        
        System.out.println("Hashtable elements with key: ");
        System.out.println(hashtable);
        
        if (hashtable.containsKey("1") && hashtable.containsValue("First"))
        {
                System.out.println("key 1 and value first are available.");
        }
        else
                System.out.println("Hashtable doesn't contain first key and value");
        if (hashtable.containsKey("second") && hashtable.containsValue("2"))
        {
                System.out.println("key second and value 1 are available.");
        }
                System.out.println("Hashtable doesn't contain key second and value 2");
              
}
	
}
