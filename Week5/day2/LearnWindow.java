package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");

		String leafWindowAddress = driver.getWindowHandle();

		System.out.println(leafWindowAddress);

		driver.switchTo().window("2E6F12B4A2C4443311C980BAD273BBB7");
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> window = new ArrayList<String>(windowHandles);

		driver.switchTo().window(window.get(1));

		String text = driver.findElement(By.xpath("//span[@class='team-member']")).getText();
		System.out.println(text);

		driver.quit();
		driver.close();

		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> multipleWindow = driver.getWindowHandles();

		List<String> multipleWindowHandle = new ArrayList<String>(multipleWindow);

		driver.switchTo().window(multipleWindowHandle.get(1));

		driver.close();

		driver.switchTo().window(multipleWindowHandle.get(1));

		driver.switchTo().window(multipleWindowHandle.get(2));
		driver.close();
		driver.switchTo().window(multipleWindowHandle.get(0));

		driver.close();
	}

}
