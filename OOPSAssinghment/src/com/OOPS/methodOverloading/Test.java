package com.OOPS.methodOverloading;

public class Test {


	 /**
    * This is the main method used  to merge two arrays.
    * 
   */
	public static void main(String[] args) {
		Arithmatic ar = new Arithmatic();
		ar.sum(10);
		ar.sum(10.5);
		ar.sum(10.5, 20.5);
		ar.sum(10, 20.5);
		ar.sum(10.5, 20);
		ar.sum(10, 10);
	}
}
