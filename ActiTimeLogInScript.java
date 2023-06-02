package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogInScript {
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		// to find username textfield
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.clear();
		Thread.sleep(5000);
		userNameTextField.sendKeys("admin");
		Thread.sleep(5000);
		WebElement passWordTextField = driver.findElement(By.name("pwd"));
		Thread.sleep(5000);
		passWordTextField.clear();
		passWordTextField.sendKeys("manager");
		Thread.sleep(5000);
		WebElement logInButton = driver.findElement(By.id("loginButton"));
		logInButton.click();
		// Enumeration is a java template
		// Keys is an one of the enum of selenium
		// inside enum we will store the constants in UPPERCASE
		// Here performing Keyboard simulation
		//element NotInteractableException if we could not able to perform the keyboard simulation
		//on the target Element
		//logInButton.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
}
}