package com.ArrayPrograms;

import java.util.Arrays;

/**
 * Problem Statement: Write a program to merge two arrays into one.
 * 
 * @author bthombre
 *
 */

public class ArrayMerge {
	
	 /**
     * This is the main method used  to merge two arrays.
     * 
     *  @param args unused.
    */
	public static void main(String[] args)   
	{  
		int[] firstArray = {23,45,12,78,4,90,1};   
		
		int[] secondArray = {77,11,45,88,32,56,3};  
		
		int firstArrayLength  = firstArray.length;        
		
		int secondArrayLength  = secondArray.length;   
		
		int[] result = new int[firstArrayLength + secondArrayLength ];    
		
		System.arraycopy(firstArray, 0, result, 0, firstArrayLength);  
		System.arraycopy(secondArray, 0, result, firstArrayLength, secondArrayLength );  
		System.out.println(Arrays.toString(result));    
	}  
}
