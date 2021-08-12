package com.Synchronisation;

public class Main {
	 /**
     * This is the main method used  to Synchronization block and Method.
     * 
     *  @param args unused.
    */
	public static void main(String t[]){
		
        //create instances of Thread_One and Thread_Two
        Thread_One t1=new Thread_One ();  
        Thread_Two t2=new Thread_Two (); 
        //start each thread instance
        t1.start();  
        t2.start();  
    }  
}
