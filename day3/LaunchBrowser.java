package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// Launch the Chrome browser using ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Load the Google homepage URL
		driver.get("https://www.google.com");

		// Get the title of the current page and store it in a variable
		String pageTitle = driver.getTitle();

		// Print the page title in the console
		System.out.println(pageTitle);

		// Check if the page title is exactly "Google"
		if (pageTitle.equals("Google")) {
			// If the title matches, print "Verified"
			System.out.println("Verified");
		} else {
			// If the title does not match, print "not Verified"
			System.out.println("not Verified");
		}

		// Get the current URL from the browser
		String currentUrl = driver.getCurrentUrl();

		// Print the current URL in the console
		System.out.println(currentUrl);

		// Check if the current URL contains the text "google.com"
		if (currentUrl.contains("google.com")) {
			// If the URL contains "google.com", print verification message
			System.out.println("URL is Verified");
		}

		// Close all browser windows and end the WebDriver session
		driver.quit();

	}
}
