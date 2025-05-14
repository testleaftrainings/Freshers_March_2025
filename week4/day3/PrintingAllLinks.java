package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllLinks {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
	
		for (int i = 0; i <elements.size(); i++) {
			
			
			System.out.println(elements.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		

	}
}
