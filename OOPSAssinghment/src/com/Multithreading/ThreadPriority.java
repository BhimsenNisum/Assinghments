package com.Multithreading;


/**
 * Problem Statement: Write a program to demonstrate priorities of thread.
 * 
 * @author bthombre
 *
 */
public class ThreadPriority extends Thread  {


	@Override

	public void run() {
		System.out.println("running thread name is:" +Thread.currentThread().getName());  
		System.out.println("running thread priority is:" +Thread.currentThread().getPriority());  
	}


	/**
	 * This is the main method used  to set priority of thread.
	 * 
	 *  @param args unused.
	 */
	public static void main(String[] args) {

		ThreadPriority threadPriority1  =  new ThreadPriority();  

		ThreadPriority threadPriority2  =  new ThreadPriority();  

		threadPriority1.setPriority(Thread.MIN_PRIORITY);  
		threadPriority2.setPriority(Thread.MAX_PRIORITY);  

		threadPriority1.start();  
		threadPriority2.start();  
	}
}
