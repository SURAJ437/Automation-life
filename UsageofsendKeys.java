package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofsendKeys {
	// Usage of Clear Method
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		// Pre condition for Sendkeys
		userNameTextField.clear();
		//IllegalArgumentException when we try to pass null as the charsequence
		//Java Exception -UncheckedException
		//userNameTextField.sendKeys(null);
		userNameTextField.sendKeys("SURAJ");
		Thread.sleep(5000);
		driver.quit();

	}
}
