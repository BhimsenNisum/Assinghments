package com.Multithreading;


/**
 * Problem Statement:  Write a program to create threads by all possible ways.
 * 
 * @author bthombre
 *
 */
public class ThreadByExtend extends Thread{
 
	/*
	 *   this is overriden run method of runnalble interface.
	 */

	@Override
	public void run() {
		System.out.println("Current Thread Started running");
	}
 
	/**
     * This is the main method used  to start thread.
     * 
     *  @param args unused.
    */
	public static void main(String[] args) {
		
		//create instances of ThreadByExtend class.
		ThreadByExtend threadByExtend = new ThreadByExtend();
		//start  thread instance
		threadByExtend.start();
	}
}
