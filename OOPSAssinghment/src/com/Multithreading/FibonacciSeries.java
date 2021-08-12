package com.Multithreading;

import java.util.Scanner;

/**
 * Problem Statement: Write a program to print Fibonacci & reverse series.
 * 
 * @author bthombre
 *
 */

public class FibonacciSeries {
	
	/**
     * This is the main method used  to merge two arrays.
     * 
     *  @param args unused.
    */
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number to find its Fibonacci series in reverse order");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int fib[] = new int[n];
		if(n>=0)
			fib[0] = 0;
		if(n>=1)
			fib[1] = 1;
		for(int i=2;i<n;i++)
			fib[i] = fib[i-1] + fib[i-2];
		for(int i=n-1;i>=0;i--)
			System.out.print(fib[i]+" ");
	}

}
