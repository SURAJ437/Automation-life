package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws Throwable {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// to find the close button popup(hidden division popup)
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
