package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethod {
	public static void main(String[] args) throws Throwable {
		//Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		// Pre Condition maximize the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the main url of the application
		driver.get("https://demo.actitime.com/");
		// find the login button and click
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		// Terminate the session
		driver.quit();	
	}
}
