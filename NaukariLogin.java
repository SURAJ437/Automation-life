package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin {
	public static void main(String[] args) throws Throwable {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser window
		driver.manage().window().maximize();
		//PASS THE MAIN URL OF THE APPLICATION
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		//To find the login button
		WebElement loginbutton = driver.findElement(By.className("Login"));
		loginbutton.click();
		Thread.sleep(5000);
		driver.quit();	
	}
}
