package week1;

public class FirstProgram {

	public static void main(String[] args) {

		// public --Access modifier
		// static --keyword
		// void --return type
		// main -- Execution entry point
		// String[]args-- command line arguments/parameters

		System.out.println("Welcome to testleaf");

		int number = 25;

		String binary = Integer.toBinaryString(number);

		System.out.println("Number: " + number);
		System.out.println("Binary value: " + binary);

	}

}
