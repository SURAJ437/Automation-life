package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Python {
	public static void main(String[] args) throws Throwable {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser window
		driver.manage().window().maximize();
		//PASS THE MAIN URL OF THE APPLICATION
		driver.get("https://www.python.org/");
		Thread.sleep(5000);
		WebElement searchtextfield = driver.findElement(By.className("search-field"));
		searchtextfield.sendKeys("selenium");
		WebElement gobutton = driver.findElement(By.id("submit"));
		gobutton.click();
		Thread.sleep(5000);
		driver.quit();
	}
}