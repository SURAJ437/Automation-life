package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultScrolingofClick {
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://www.facebook.com/");
		// Click on messanger
		// Element not in the view port AREA-NoSuchElementException
		// Click has the default scrolling ability
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(5000);
		// Terminate the session
		driver.quit();
}
}