package week1;

public class Car {

	public static void main(String[] args) {
//object creation Syntax

		// className objectName =new ClassName();
		Car c = new Car();
		c.add(10, 20);

		c.applyingBrake();
		c.applyingAccelarator();

	}

	// access modifier return type methodName(){
	// }

	public void applyingBrake() {

		System.out.println("Brake Applied");

	}

	public void applyingAccelarator() {

		System.out.println("applying Accelarator");

	}

	public void add(int a, int b) {

		System.out.println(a+b);

	}

}
