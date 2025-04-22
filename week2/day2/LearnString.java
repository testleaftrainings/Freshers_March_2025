package week2.day2;

import java.util.Arrays;

public class LearnString {
	
//	
//	String:
//		Strings in Java are immutable, meaning their values cannot be changed after they are created. 
//		This immutability has several implications for how strings are handled in Java.
//
//
//		The String class provides various methods for manipulating strings, 
//		such as length(), charAt(), substring(), indexOf(), toLowerCase(), toUpperCase()
//
//		ex:
//		String company = "Test Leaf";
//		int length = company.length(); // Returns the length of the string
//		char firstChar = company.charAt(0); // Returns the character at index 0
//		String subString = company.substring(5, 8); // Returns a substring from index 5 to 7
//		int index = company.indexOf("leaf"); // Returns the starting index of 
//
//
//
//		String:
//		1.length
//		2.equals
//		3.equalsignorecase
//		4.contains
//		5.tocharArray
//		6.charAt
//
//

	public void sample() {
		
	}

	public void sample(String b) {
		
	}
	public static void main(String[] args) {
		
		LearnString obj = new LearnString();
		obj.sample();
		obj.sample("bjhggfhj");

		// String literal

		// String variableName= "value";

		String name = "Testleaf";
		String name1 = "TestleaF";
		String name2 = "Testleaf";
		String name3 = "Testleaf";
		String name4 = "Testleaf";
		
		
		name.toCharArray();
		
		
		
		//to get the length of the string
		int length = name.length();

		System.out.println(name.length());
		System.out.println(length);
		//to lowercase
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		//to Uppercase
		String upperCase = name.toUpperCase();
		
		System.out.println(upperCase);
		

		// .equal -->Checks the value of the data 

		if (name.equals(name1)) {

			System.out.println("Verified");

		}
		if (name.equalsIgnoreCase(name1)) {

			System.out.println("Verified");

		}
		
		//Checks the address of the value 
		if (name == name1) {

			// adress(name) == name1(Address)

			System.out.println("Verified");

		}

		//checks the partial value of the data
		
		if (name.contains("Test")) {

			// adress(name) == name1(Address)

			System.out.println("Verified");

		}

		// String Instantiation
		// String name1 = new String("Testleaf");

		
		
		//replace all
		
		String value = "Testleaf";
		String replace = value.replace('e', 'g');
		
		System.out.println(replace);
		
		
		String replaceAll = value.replaceAll(value, "vinoth");
		
		System.out.println(replaceAll);
		
		
		
		
		//split() method
		
		String str="Java is my favourite Programming language";
		//          0     1 2   3       4                5
		//              
		//Java si my  etiruovaf Programming egaugnal
		String[] split = str.split(" ");
		
		
		for (int i = 0; i < split.length; i++) {
		//System.out.println(split[i]);
		
		if (i%2!=0) {
			System.out.println(split[i]);
			
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
