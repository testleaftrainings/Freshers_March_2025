package wek3.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkodaCar extends Maruti {


	public void wiper() {
		System.out.println("wiper");
	}
	
	
	public void autoGear() {
		System.out.println("auto Gear");
	}
	
	public static void main(String[] args) {
		SkodaCar  obj= new SkodaCar();
		
		obj.applyingBreak();
		obj.soundHorn();
		obj.applyingGear();
		System.out.println(obj.wheels);
		
		obj.automaticWindow();
		
		obj.wiper();
		obj.autoGear();
		
		
	}



}
