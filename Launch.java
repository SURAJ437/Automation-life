package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	public static void main(String[] args) throws Throwable  {
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://cms.bombax.in/");
		driver.quit();
	}
}