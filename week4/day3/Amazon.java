package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/link.xhtml");

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='grid formgrid']//a"));

//		for(WebElement elements:links) {
//			
//			System.out.println(elements.getText());
//		}
//		

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());

		}

	}

}
