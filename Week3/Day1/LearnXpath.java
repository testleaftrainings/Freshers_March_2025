package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--incognito");

		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesmanager");
		
		
		
	}

}
