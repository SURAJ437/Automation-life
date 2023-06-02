package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverPosition {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Pre condition
		// maximixze the browser window
		driver.manage().window().maximize();
		// pass the main URL of the application
		driver.get("http://www.leafground.com/pages/Window.html");
		// Identify the buttton and click on it
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		// Get all the window ID's in the session
		Set<String> allwindowIds = driver.getWindowHandles();
		// Ittertatively take one window ID a time
		for (String wid : allwindowIds) {
			// Capturing the window Title iteratively
			String actualWindowTitle = driver.switchTo().window(wid).getTitle();
			//Printing the window title which we captured
			System.out.println("actualWindowTitle = "+actualWindowTitle);
			// Transfering the driver control to specigfiv window upon the validation of its Title
			if (actualWindowTitle.equals("TestLeaf - Interact with Buttons")) {
				// Create the point type object to set the position
				Point targetPosition = new Point(200, 400);
				// Set the user defined position
				driver.manage().window().setPosition(targetPosition);
				// Create the dimension type object to set the size of the targetWindow
				Dimension targetSize = new Dimension(300, 500);
				// Set the size of the targetWindow
				driver.manage().window().setPosition(targetPosition);
			}
		}
		// Terminate the session
		driver.quit();
	}
}