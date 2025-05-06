package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// opt.addArguments("--incognito");
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");

		
		List<WebElement> heading= driver.findElements(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));
		
		//List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		
		for (int i = 0; i <heading.size(); i++) {
			
			String text = heading.get(i).getText();
			
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.name("PASSWORD"));

		File src = driver.getScreenshotAs(OutputType.FILE);

		File dst = new File("./snap/image1.png");

		FileUtils.copyFile(src, dst);

		
		File screenshotAs = password.getScreenshotAs(OutputType.FILE);
		File  des=new File("./snapElement/elemnt.png");
		
		FileUtils.copyFile(screenshotAs, des);
		
		
	}
}
