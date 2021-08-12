package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Problem Statement:  Write a program to reverse a array list.
 * 
 * @author bthombre
 *
 */

public class ArrayListReverse {

	
	/**
     * This is the main method used  to  reverse a array list.
     * 
     *  @param args unused.
    */

	public static void main(String[] args) {
		
		// initialising arraylist Object.
		List<String> list = new ArrayList<String>();
		
		// adding elements into list
		list.add("Mango");  
		list.add("Banana");  
		list.add("Mango");  
		list.add("Apple");  
		
		System.out.println("Before Reversing");  
		System.out.println(list.toString());  

		// perform reverse by using collections
		Collections.reverse(list);  
		System.out.println("After Reversing");  
		System.out.println(list);  
	}  


}
