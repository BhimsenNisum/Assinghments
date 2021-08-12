package com.collections;

import java.util.Iterator;
import java.util.TreeSet;


/**
 * Problem Statement:    Write a program to insert, retrieve & remove record.
 * 
 * @author bthombre
 *
 */
public class InsertUpdateDelete {
	
	
	 /**
     * This is the main method used  to merge two arrays.
     * 
     *  @param args unused.
    */
	public static void main(String[] args)
	{
		// create an object of TreeSet
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// add the elements into treeset.
		set.add(211);
		set.add(111);
		set.add(314);
		set.add(155);
		set.add(234);
		set.add(244);
		
		// Iterate the Treeset
		Iterator<Integer> iterator = set.iterator();
		System.out.println("The elements of TreeSet");
		while (iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		if (set.isEmpty())
		{
			System.out.println("\nTreeSet is empty.");
		}
		else
			System.out.println("\nSize of the TreeSet: "+set.size());

		//fetching first and last data
		System.out.println("\nFirst element of TreeSet: "+set.first());
		System.out.println("Last element of TreeSet: "+set.last());
		
		//remove the element of TreeSet
		if (set.remove(314))
		{
			System.out.println("\nData 23 is deleted: ");
		}
		else
		{
			System.out.println("\nData is not present in TreeSet");
		}
		iterator = set.iterator();
		System.out.println("\nNow the elements of TreeSet");
		while (iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println("\nSize of the TreeSet: "+set.size());
		//remove all element
		set.clear();
		if (set.isEmpty())
		{
			System.out.println("\nTreeSet is Empty.");
		}
		else
			System.out.println("Size of the TreeSet: "+set.size());
	}
}
