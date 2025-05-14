package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://www.leafground.com/alert.xhtml");

		driver.findElement(By.xpath("//span[text()='Show']")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		alert.accept();

		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following::span")).click();
		
		System.out.println(alert.getText());
		
		alert.dismiss();
		

		String text2 = driver.findElement(By.id("result")).getText();
		
		System.out.println(text2);
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::span")).click();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("vinoth");
		
		alert.accept();
		
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text3);
		
		
		
		
		//span[text()='Dismiss']
		
		
		
		
		
		
		 

	}
	
}
