package ArrayList;

import java.util.ArrayList;


/**
 * Problem Statement: Write a program to remove the element by given index from a array list.
 * 
 * @author bthombre
 *
 */
public class ArrayListRemoveIndex {
	
	
	/**
     * This is the main method used  to remove the element by given index from a array list.
     * 
     *  @param args unused.
    */
	public static void main(String[] args) {
		
		
		// create an empty array list with an initial capacity
	      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      // use add() method to add elements in the deque
	      arrlist.add(20);
	      arrlist.add(15);
	      arrlist.add(30);
	      arrlist.add(45);

	      System.out.println("Size of list: " + arrlist.size());
	      
	      // let us print all the elements available in list
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }  
	      
	      // Removes element at 3rd position
	      System.out.println("Remove the element"  +  arrlist.remove(2));
	      

	      System.out.println("Now, Size of list: " + arrlist.size());
	      
	      // let us print all the elements available in list
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }
	   }
	

}
