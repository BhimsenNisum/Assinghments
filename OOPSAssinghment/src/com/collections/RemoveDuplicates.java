package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem Statement:  Write a program to delete duplicate object from ArrayList.
 * 
 * @author bthombre
 *
 */
public class RemoveDuplicates {

	/**
     * This is the main method used  delete duplicate object from ArrayList.
     * 
     *  @param args unused.
    */

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Hyderabad");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Mumbai");

		System.out.println("Before Removing Duplicates");
		System.out.println(list.toString());

		System.out.println("After Removing Duplicates");
		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);

	}
}
