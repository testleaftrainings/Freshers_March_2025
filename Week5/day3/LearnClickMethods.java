package week5.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClickMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/messages.xhtml");

		driver.executeScript("document.getElementById('j_idt100:firstname').value='testleaf'");

//		WebElement element3 = driver.findElement(By.id("j_idt100:firstname"));

//		String attribute = element3.getDomAttribute("value");

//		System.out.println(attribute);

	}
}
