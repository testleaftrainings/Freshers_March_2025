package week4.day1;

public class MethodOverloading {

	public void add() {

	}

	public void add(int a, int b) {

		System.out.println(a + b);

	}

	public void add(float a, float b) {

		System.out.println(a - b);

	}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(564.34f, 1233.33f);

		obj.add(23, 2);

	}

	public static void main(int[] args) {
		System.out.println("int[] args");
	}

	public static void main(char[] args) {

	}

	public static void main(boolean[] args) {

	}
	
	
	//Overloading Example 
	//java Example 
	//println
	
	//selenium 
	//driver.switchTo().framne();
	

}
