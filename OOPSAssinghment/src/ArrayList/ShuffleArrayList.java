package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Problem Statement:  Write a program to shuffle the given array list.
 * 
 * @author bthombre
 *
 */
public class ShuffleArrayList {

	/**
     * This is the main method used  to shuffle the given array list.
     * 
     *  @param args unused.
    */

	public static void main(String[] args) {
		
		// creating object of ArrayList class  
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// Adding elements in array List
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(3);
		arrayList.add(9);
		System.out.println("Original list : " + arrayList);

		// shuffling the list
		Collections.shuffle(arrayList); 
		System.out.println("Shuffled list : " + arrayList);
	}
}
