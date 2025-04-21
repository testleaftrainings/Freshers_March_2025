package week2.day1;

import java.util.Arrays;

public class SecondLargest {

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

			System.out.print(" " + num[i]);

		}

		Arrays.sort(num);

		System.out.println("\n" + "largest Number : " + num[num.length - 1]);

		System.out.println("\n" + "second largest Number : " + num[num.length - 2]);
		
		System.out.println("\n" + "Smallest Number : " + num[0]);
		
		
		System.out.println("\n" + "After Sorting ");
		for (int i = 0; i < num.length; i++) {

			// java.lang.ArrayIndexOutOfBoundsException:

			System.out.print("  " + num[i]);

		}

	}

}
