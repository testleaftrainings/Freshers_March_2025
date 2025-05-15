package week5.day3;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		
		
		
		
//		j.executeScript ("document.getElementById('gsc-i-id1').value='Selenium'");
//		WebElement l = driver.findElement(By.id("gsc-i-id1"));
//		String s = l.getAttribute("value");
//		System.out.println("Value entered is: " + s);
		
		WebElement element2 = driver.findElement(By.xpath("//div[text()='CLiQ Cash']"));
		//click using selenium click
		//element2.click();
		
		// Click using javascript
		//driver.executeScript("arguments[0].click();", element2);
		
		
		// click using Actions 
		Actions act= new Actions(driver);
		
		act.click(element2).perform();
		
		
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Categories']"));
		
		act.moveToElement(element).perform();
		
		WebElement webApp = driver.findElement(By.xpath("//div[text()='Download App']"));
		act.scrollToElement(webApp).perform();	
		
		//act.contextClick(webApp).perform(); --to right click		
		act.contextClick().perform();
		
		
		
		
		
		
		
		
		
		
		

	}
}