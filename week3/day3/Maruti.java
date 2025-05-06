package wek3.day3;

public class Maruti extends Vehicle {


	public void automaticWindow() {
		System.out.println("automaticWindow");
		
		
	}
	

	public static void main(String[] args) {
		
		Maruti obj = new Maruti();
		
		obj.applyingBreak();
		obj.applyingGear();
		obj.soundHorn();
		System.out.println(obj.wheels);
		obj.automaticWindow();
		
	}

	

}
