package com.ArrayPrograms;


/**
 * Problem Statement: Write a program to print even & odd numbers
 * 
 * @author bthombre
 *
 */
public class EvenOdd {

	

	 /**
    * This is the main method used  to find  even & odd numbers.
    * 
    *  @param args unused.
   */
	public static void main(String[] args) {
		
		// initialisation of array
		int arr[]={1,2,5,6,3,2};  

		System.out.println("Odd Numbers:");  
		for(int i=0;i<arr.length;i++){  
			if(arr[i]%2!=0){  
				System.out.println(arr[i]);  
			}  
		}  
		
		System.out.println("Even Numbers:");  
		for(int i=0;i<arr.length;i++){  
			if(arr[i]%2==0){  
				System.out.println(arr[i]);  
			}  
		}  

	}
}
