package wek3.day3;

public class Oveloading {

	static void run() {
		System.out.println("Running in Parent");
	}

	// compiletime polymorphism

	public void add() {
		System.out.println(10 + 10);

	}

	public void add(int a) {

	}

	public void add(boolean a) {

	}

	public void add(int a, String b) {

	}

	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		String [] b= new String[3];
		System.out.println(b[1]);
		Oveloading.run();
		Oveloading obj = new Oveloading();

		obj.add();
		obj.add(false);
		obj.add(456);
		obj.add(23, "test");

	}

}
