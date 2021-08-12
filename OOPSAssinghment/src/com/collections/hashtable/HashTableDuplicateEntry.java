package com.collections.hashtable;

import java.util.Hashtable;
import java.util.Set;


/**
 * Problem Statement:    Write a program to remove duplicate key from hashtable.
 * 
 * @author bthombre
 *
 */
public class HashTableDuplicateEntry {
	
	 /**
     * This is the static method used  to findUnion.
     * 
     */
	public static void main(String a[])
    {
		
		/* HashTable  Declaration */
		  Hashtable<Students,String> hashtable = new Hashtable<Students, String>();
		  
		  
		  /*add( Student object and String Element) is used to put 
			 * the elements to the HashTable*/
		  
	        hashtable.put(new Students(101,"Ram",81101), "RAM");
	        hashtable.put(new Students(121,"Ravi",82121), "RAVI");
	        hashtable.put(new Students(110,"Atul",83110), "ATUL");
	        hashtable.put(new Students(102,"Anil",81102), "ANIL");
	        
	        System.out.println("Adding duplicate entry:");
	        hashtable.put(new Students(102,"Anil",81102), "ANIL");
	        
	        System.out.println("Hashtable entries:");
	        
	        Set<Students> keys = hashtable.keySet();
	        for(Students key:keys)
	        {
	            System.out.println(key+" ==> "+hashtable.get(key));
	        }
	        System.out.println("Duplicate keys eliminated!!!");
	    }
		
		
    
}
