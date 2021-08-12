package com.ProducerConsumer;

import java.util.LinkedList;


/**
 * This is the main method used  to  producer consumer problem.
 * 
 *  
*/
public class Main {

	public static void main(String[] args) {
		// shared list
		LinkedList<Integer> list = new LinkedList<Integer>();
		Thread t1 = new Thread(new Producer(list), "Producer");
		Thread t2 = new Thread(new Consumer(list), "Consumer");
		t1.start();
		t2.start(); 

	}
}
