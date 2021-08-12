package com.Multithreading;


/**
 * Problem Statement:  Write a program to create threads by implementing Runnable Interface .
 * 
 * @author bthombre
 *
 */
public class ThreadByImplimentingRunnable implements Runnable {
	
	/*
	 *  this is overriden run method of runnalble interface.
	 */

	@Override
	public void run() {
		System.out.println("concurrent thread started running..");
	}
	
	
	/**
     * This is the main method used  to start thread.
     * 
     *  @param args unused.
    */
	
	public static void main(String[] args) {
		//create instances of ThreadByImplimentingRunnable class.
		ThreadByImplimentingRunnable threadByImplimentingRunnable = new ThreadByImplimentingRunnable();
		//start  thread instance
		Thread t = new Thread(threadByImplimentingRunnable);
        t.start();
	}

}
