package week5.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");

		List<WebElement> elements = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/td[2]"));
		
		
		for (int i = 0; i < elements.size(); i++) {
			
			String text = elements.get(i).getText();
			
			System.out.println(text);
		}
		
		
		System.out.println("Printing all the data from table");
		
		
		List<WebElement> elements2 = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/td"));
		
		for (int i = 0; i < elements2.size(); i++) {
			String text = elements2.get(i).getText();
			
			System.out.print ("\n"+text);
		}
		
		
		
		
	}

}
