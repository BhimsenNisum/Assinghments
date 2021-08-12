package com.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Statement:  Write a program to remove an element from array.
 * 
 * @author bthombre
 *
 */

public class RemoveElement {
	
	 /**
	    * This is the main method used  to  remove an element from array.
	    * 
	    *  @param args unused.
	   */
	public static void main(String[] args) {
		
		// initialisation of array
        int[] arr = new int[]{1,2,3,4,5};
        
        // create an object of Array list.
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);
 
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" +arr_new);
 
    }
		
	
}