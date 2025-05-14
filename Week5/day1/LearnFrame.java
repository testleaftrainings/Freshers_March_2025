package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

//	Frames are like  another DOM embeded inside the DOM
//
//	- **switchTo().window(String windowHandle)**: Switches focus to the specified window.
//	- **switchTo().frame(int index)**: Switches focus to the frame at the specified index.
//	- **switchTo().frame(String nameOrId)**: Switches focus to the frame with the specified name or ID.
//	- **switchTo().frame(WebElement frameElement)**: Switches focus to the specified frame element.
//	- **switchTo().defaultContent()**: Switches focus back to the default content (i.e., main window or top-level frame).
//	- **switchTo().parentFrame()**: Switches focus to the parent frame of the current frame.
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vinoth");
//frame1 

		// driver.switchTo().frame(0);--using Index Method
		WebElement element = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

// to get out of all the frame
		driver.switchTo().defaultContent();

//Frame 2
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		// used to get out of all the frame
		driver.switchTo().defaultContent();

//Frame 3(Nested Frame)

		// org.openqa.selenium.NoSuchFrameException:-- if the frame value is not correct

		// outer frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));

		// inner frame
		driver.switchTo().frame("frame2");

		driver.findElement(By.id("Click")).click();

		driver.switchTo().parentFrame();
		// used to switch to parent frame

	}

}
