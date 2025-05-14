package week4.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		// List<Genric data> variableName= new ImplementationClass<genric Data>();

		List<String> students1 = new ArrayList<String>();

//		List<Object> marks = new ArrayList<Object>();
//	
//		marks.add("vinoth");
//		marks.add(123);
//		marks.add('c');
//		marks.add(true);
		
		
		// to add the element to the list
		students1.add("Sam");
		students1.add("Veda");
		students1.add("Hindu");
		List<String> students = new ArrayList<String>();

		// to add the element to the list
		students.add("Sam");
		students.add("Veda");
		students.add("Hindu");
		students.add("jeevana");
		students.add("Jayashree");
		students.add("indra");
		students.add("Yamini");
		students.add("jeevana");
		students.add("jeevana");
		students.add("jeevana");
//		students.add(9, "vinoth");

		boolean contains = students.contains("Veda");
		System.out.println(contains);

		System.out.println(students);

		students.remove("Yamin");

		students.clear();
		// students.removeAll(students);
		int size = students.size();
		System.out.println(size);

		System.out.println(students);

	}

}
