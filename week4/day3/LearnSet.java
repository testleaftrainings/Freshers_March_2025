package week4.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> students = new TreeSet<String>();

//LinkedHashSet-- FIFO order
//HashSet -- Random Order
//TreeSet -- Randomorder		

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
		System.out.println(students);
		
		List<String> obj =new ArrayList<String>(students);
		
		String name = obj.get(0);
		System.out.println(name);
	}
}
