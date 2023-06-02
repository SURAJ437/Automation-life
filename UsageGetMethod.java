package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageGetMethod {
	public static void main(String[] args) {
		//step1: to launch empty chrome browser
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class 
		WebDriver driver = new ChromeDriver();
		// step2: pass the main URL of the application
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
}
