package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		// Launch the Chrome browser using ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Load the OrangeHRM homepage URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
}
