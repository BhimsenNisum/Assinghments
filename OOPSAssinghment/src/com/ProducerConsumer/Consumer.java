package com.ProducerConsumer;

import java.util.LinkedList;


/**
 * Problem Statement: Write a program for producer consumer problem.
 * This is a Consumer class.
 * 
 * @author bthombre
 *
 */
public class Consumer implements Runnable {

    // initialisation of linkedlist.
	LinkedList<Integer> list;
	Consumer(LinkedList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++){
			synchronized(list) {
				// if there is no element in the list wait
				while(list.size() < 1){
					System.out.println("Waiting as queue is empty..");
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// if there is element in the list then retrieve it
				System.out.println("Consuming from queue- " + Thread.currentThread().getName() + " " + list.remove());
				list.notify();  
			}
		}		
	}
}
