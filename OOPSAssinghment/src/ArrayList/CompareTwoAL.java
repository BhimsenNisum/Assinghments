package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement:  Write a program to compare two array lists.
 * 
 * @author bthombre
 *
 */
public class CompareTwoAL {

	
	public static void main(String[] args) {
		
		/**
	     * This is the main method used  to compare two array lists.
	     * 
	     *  @param args unused.
	    */
		
		//first array list  
		ArrayList<String> firstList=new ArrayList<String>();  
		//adds elements to the arraylist  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Mango");  
		System.out.println(firstList);  
		
		//second array list      
		List<String> secondList=new ArrayList<String>();  
		//adds elements to the arraylist  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Guava");  
		secondList.add("Mango");  
		System.out.println(secondList);  
		
		
		//comparing both lists  
		boolean boolvalue = firstList.equals(secondList); 
		//returns true because lists are equal  
		System.out.println(boolvalue);  
		
		//adding another element in the second list  
		secondList.add("Papaya");  
		
		//again comparing both lists  
		boolean bool = firstList.equals(secondList);
		//returns false because lists are not equal   
		System.out.println(bool);  
		}  
	
	
	
}
