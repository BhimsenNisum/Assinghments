package com.collections;


/**
 * Problem Statement:    Write a program to implement intersection & union.
 * 
 * @author bthombre
 *
 */
public class UnionIntersection {
	
	
	 /**
     * This is the static method used  to findUnion.
     * 
     */
    private static void findUnion(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                System.out.print(firstArr[i] + " ");
                i++;
            } else if (secondArr[j] < firstArr[i]) {
                System.out.print(secondArr[j] + " ");
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }

        while (i < firstArr.length) {
            System.out.print(firstArr[i] + " ");
            i++;
        }

        while (j < secondArr.length) {
            System.out.print(secondArr[j] + " ");
            j++;
        }
    }


	 /**
    * This is the static method used  to findIntersection.
    */
    private static void findIntersection(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                i++;
            } else if (firstArr[i] > secondArr[j]) {
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }
    }
    
    /**
     * This is the main method used  implement intersection & union.
     * 
    */
    
    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3, 4, 5, 6};
        int[] secondArr = {4, 9, 13, 15, 16, 17};

        System.out.println("union is");
        findUnion(firstArr, secondArr);
        System.out.println();
        System.out.println("Intersection is at Number");
        findIntersection(firstArr, secondArr);
        
    }
}
