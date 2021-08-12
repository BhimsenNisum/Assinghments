package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Problem Statement:  Write a program to sort the given array list.
 * 
 * @author bthombre
 *
 */
public class ArrayListSort {

	
	/**
     * This is the main method used  to sort the given array list.
     * 
     *  @param args unused.
    */
	public static void main(String args[])   
	{   
		// creating object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();   
		
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);   
	}   
}
