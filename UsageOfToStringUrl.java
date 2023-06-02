package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringUrl {
	public static void main(String[] args) throws Throwable {
		// set the driver executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// instantiate browser specific class
		WebDriver driver = new ChromeDriver();
		// to maximize the browser window
		driver.manage().window().maximize();
		// Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		driver.navigate().back();
		// Pass the suburl if the defence page
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		// Pass the suburl of Civil page
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		Thread.sleep(5000);
		// Pass the suburl of space page
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		Thread.sleep(5000);
		// Pass the suburl of passion Page
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		// To terminate the session
		driver.quit();
	}
}
