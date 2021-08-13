package com.ExceptionHandelling1;


/**
 * Problem Statement:   Write a program to define multiple catch blocks for th exception handling.
 * 
 * @author bthombre
 *
 */
public class MultipleCatch {
	
	/**
     * This is the main method used  to define multiple catch blocks for th exception handling.
     * 
     *  @param args unused.
    */
	public static void main(String[] args) {  

		
		//try followed by multiple catch block.
		
		try{    
			int a[]=new int[5];    
			a[5]=30/0;    
			System.out.println(a[10]);  
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs");  
		}             
		
		System.out.println("rest of the code");    
	}  
	
}
