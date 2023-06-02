package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbscuredElementClick {
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		// Handle the abscurd element before performing action
		driver.findElement(By.xpath("//div/span[contains(.,\"Don't Change\")]")).click();
		Thread.sleep(5000);
		// to click on customer sevice
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(5000);
		// Terminate the session
		driver.quit();
}
}