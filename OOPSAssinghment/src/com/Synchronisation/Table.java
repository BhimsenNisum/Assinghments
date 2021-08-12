package com.Synchronisation;


/**
 * Problem Statement:  Write a program for defining Synchronization block and Method.
 * 
 * @author bthombre
 *
 */
public class Table {

	//synchronized static method to print squares of numbers
	  synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.print(n*i + " ");  
	     
	     try{  
	       Thread.sleep(400);
	     }catch(Exception e){}
	     
	   } 
	   System.out.println();
	 }  
}
