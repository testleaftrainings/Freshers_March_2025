package week2.day1;

public class LearnVariables {
//Global 
	int age = 30;
	static int mark = 42;
	final String name = "TestLeaf";

	public static void methodName() {
//local vallriable	
		int mark = 42;
		mark = 32;

		mark = 12;

		System.out.println(mark);

		// age = 27;
		// System.out.println(age);

	}

	public void methodName1() {
		age = 35;

		mark = 32;
		mark = 12;
		// name="sam";

		System.out.println(name);
		System.out.println();
	}

	public static void main(String[] args) {
		LearnVariables obj = new LearnVariables();
		System.out.println(obj.age);

		LearnVariables.methodName();
		obj.methodName1();

	}

}
