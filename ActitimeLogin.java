package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) throws Throwable {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Maximize the Browser window
		driver.manage().window().maximize();
		//PASS THE MAIN URL OF THE APPLICATION
		driver.get("https://demo.actitime.com/login.do");
		// Find the username in webpage
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		Thread.sleep(5000);
		//To find rhe password Textfield
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");
		Thread.sleep(5000);
		//To find the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		//terminate the session
		driver.quit();
		
		
	}

}
