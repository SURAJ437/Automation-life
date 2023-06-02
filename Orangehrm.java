package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static void main(String[] args) throws Throwable {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser window
		driver.manage().window().maximize();
		//PASS THE MAIN URL OF THE APPLICATION
		driver.get("https://www.orangehrm.com/");
		//to find email adress textfield
		WebElement emailadresstextfield = driver.findElement(By.className("home-tril-email"));
		Thread.sleep(5000);
		//to pass user emailaddress
		emailadresstextfield.sendKeys("surajsajjan84@gmail.com");
		Thread.sleep(5000);
		driver.quit();

	}
}
