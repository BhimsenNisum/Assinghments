package com.ProducerConsumer;

import java.util.LinkedList;


/**
 * Problem Statement: Write a program for producer consumer problem.
 * This is a Producer class.
 * 
 * @author bthombre
 *
 */
public class Producer implements Runnable{

	// initialisation of linkedlist.
	LinkedList<Integer> list;
	Producer(LinkedList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++){
			synchronized(list) {
				// If there is already an element in the list wait
				while(list.size() >= 1){
					System.out.println("Waiting as queue is full..");
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Adding to queue- " + Thread.currentThread().getName() + " " + i);
				list.add(i);
				list.notify();    
			}
		}		
	}
}
