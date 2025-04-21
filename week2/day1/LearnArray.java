package week2.day1;

import java.util.Arrays;

public class LearnArray {

	
//	Arrays:
//		 An array in Java is a data structure that allows you to store multiple values of
//		 the same data type under a single variable name. Arrays provide a way to efficiently
//		 manage and access a collection of elements of the same type. Each element in an 
//		 array is identified by an index, starting from 0 for the first element.
//
//		 Example: int[] myArray = {1, 2, 3, 4, 5};
//
//		array will be work on index value -start from '0'
//

	// Array literal

	// syntax

	// dataType variableName[]= {432,342,432,4,2};

	public static void main(String[] args) {
		// int age = 10;
		int num[] = { 3, 4, 5, 6, 1, 2, 7, 8, 9, 10, 25, 65, 43 };
//                    1  2  3  4  5  6  7  8  9  10  11  12  13  
		// 0 1 2 3 4 5 6 7 8 9 10 11 12

		// System.out.println(age);
		System.out.println("Before Sorting ");
		for (int i = 0; i < num.length; i++) {

			// java.lang.ArrayIndexOutOfBoundsException:

			System.out.print(" "+num[i]);

		}

		Arrays.sort(num);
		
		System.out.println("\n"+"After Sorting ");
		for (int i = 0; i < num.length; i++) {

			// java.lang.ArrayIndexOutOfBoundsException:

			System.out.print("  "+num[i]);

		}

	}

}
