package com.Multithreading;

/**
 * Problem Statement: Write a program to display all running thread.
 * 
 * @author bthombre
 *
 */
public class RunningThreads extends Thread {

	/**
     * This is the main method used  to merge two arrays.
     * 
     *  @param args unused.
    */
	
	public static void main(String[] args)
	{
		System.out.println("Main Begin");
		
		Thread thread = Thread.currentThread();
		
		System.out.println(thread);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		thread.setName("INDIA");
		thread.setPriority(10);
		System.out.println(thread);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		System.out.println("main end");
	}
}
