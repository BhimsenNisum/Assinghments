package com.ArrayPrograms;

import java.util.Arrays;


/**
 * Problem Statement:  Write a program to sort array using Bubble sort.
 * 
 * @author bthombre
 *
 */
public class ArraySort {


	static void BubbleSort(int array[]) {
		boolean swapped;
		for(int i =0; i<array.length;++i) {
			swapped = false;
			for(int j = 1; j<array.length;++j) {

				if(array[j-1]>array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					swapped = true;
				}

			}
			if(!swapped)
				break;
		}
	}

	/**
	 * This is the main method used to sort array using Bubble sort.
	 * 
	 *  @param args unused.
	 */
	public static void main(String[] args) {
		int array[] = { 1 , 10 , 4 , 5 , 2 , 3 , 11 , 9 };
		System.out.println("Array Before Sort: "+Arrays.toString(array));
		BubbleSort(array);
		System.out.println("Array After Sort: "+Arrays.toString(array));
	}

}
