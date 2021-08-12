package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



/**
 * Problem Statement: Write a program to find an element in a array list.
 * 
 * @author bthombre
 *
 */
public class ElementsInArrayList {
	
	/**
     * This is the main method used  to find an element in a array list.
     * 
     *  @param args unused.
    */

	public static void main(String[] args) {
		
		//Initialisation of arraylist object.
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("AAAA");
		arraylist.add("BBBB");
		arraylist.add("CCCC");
		arraylist.add("DDDD");
		arraylist.add("EEEE");
		
		
		// Size of array list
		System.out.println(arraylist.size());
		
		arraylist.isEmpty();
		
		System.out.println("Iteration of ArrayList By Iterator");
		 
		// iteration of array list by iteratror.
		Iterator iterator = arraylist.iterator();
		
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			String s = (String) object;
			System.out.println(s);
		}
	}
	
	
}
