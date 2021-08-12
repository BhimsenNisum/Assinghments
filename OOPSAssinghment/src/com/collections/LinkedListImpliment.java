package com.collections;

import java.util.LinkedList;
/**
 * Problem Statement:   Write a program to Implement LinkedList.
 * 
 * @author bthombre
 *
 */

public class LinkedListImpliment {

	
	/**
     * This is the main method used  Implement to Implement LinkedList.
     * 
    */
	public static void main(String[] args) {
		
		/* Linked List Declaration */
		LinkedList<String> linkedlist = new LinkedList<String>();
		

		/*add(String Element) is used for adding 
		 * the elements to the linked list*/
		
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");

		/*Display Linked List Content*/
		System.out.println("Linked List Content: " +linkedlist);

		/*Add First and Last Element*/
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Content after addition: " +linkedlist);

		
		
		
	}


}
