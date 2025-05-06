package week3.day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnXpath {

	private static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// opt.addArguments("--incognito");
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesmanager");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");// 30

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement element2 = driver
				.findElement(By.className("a-size-medium-plus a-spacing-none a-color-base a-text-bold"));

		wait.until(ExpectedConditions.stalenessOf(element2));

		System.out.println(element2.getText());

		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();// 30

		// driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.partialLinkText("SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select obj = new Select(element);
		obj.selectByIndex(4);
		obj.selectByValue("LEAD_CONFERENCE");

		// obj.selectByVisibleText("Existing Customer");

//		
//		String name="";
//		name.equals(obj)
//		driver.quit();

	}

}
