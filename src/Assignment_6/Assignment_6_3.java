/**
 * 
 */
package Assignment_6;																					// package Declared
import java.util.Scanner;																				// Scanner Class initiated
/**
 * Write a program to search an element in a one-dimensional array using Binary Search Algorithm.
 * Display a message stating whether element found in an array or not. Also, display the index position of the element if found.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_6_3 {																			// Class Declared
public static  Scanner in = new Scanner(System.in);														// scanner class initiated to read input from user
public static void main(String[] args) {																// Main method started
	int counter, first, last, middle, numberOfElements, search, array[];								// 6 integer variables and one integer array declared
	System.out.print("Enter number of elements : ");													// print statement
	numberOfElements = in.nextInt(); 																	// array length input from user
	    array = new int[numberOfElements];																// array initiated
	System.out.println("Enter One-Dimensional Array of " + numberOfElements + " integers : ");			// print statement
		for (counter = 0; counter < numberOfElements; counter++)										// for loop to decide the length of the array
	      array[counter] = in.nextInt();																// get array input from the user
	System.out.print("Enter value to be found : ");														// print statement
	    search = in.nextInt();																			// enter the element to be found in the array
	    first  = 0;																						// variable first element is initiated with the value zero
	    last   = numberOfElements - 1;																	// variable last element is initiated with total number of element -1
	    middle = (first + last)/2;																		// Find the middle element
	    while( first <= last ) {																		// while loop expression condition when fist element is less then last element
	      if ( array[middle] < search )																	// in binary search the , algo start start searching the element from the middle
	        first = middle + 1;    																		// the position of first element is middle plus one position
	      else if ( array[middle] == search ) {															// else if loop .. middle position is equal to the search
	        System.out.println("\n"+search + " found at location " + (middle + 1) + ".");				// Print the location of the counter
	        break;}																						// break statement
	      else																							// else loop to move the counter towards the left of the array
	         last = middle - 1;																			// last variable is assigned the location middle min one
	      middle = (first + last)/2;}																	// again find the middle position of the array
	   if ( first > last )																				// if loop to check first element is greater then last element
	      System.out.println("\n"+search + " is not present in the list.\n");							// Print statement
	}																									// main method closed
}																										// class closed

