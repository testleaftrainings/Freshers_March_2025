package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllLinkusingSet {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		List<WebElement> elements = driver.findElements(By.tagName("a"));

		Set<WebElement> setElement = new LinkedHashSet<WebElement>(elements);

		List<WebElement> unique = new ArrayList<WebElement>(setElement);

		for (int i = 0; i < unique.size(); i++) {

			System.out.println(unique.get(i).getText());
			
		}

	}
}
