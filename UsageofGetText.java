package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetText {
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://demo.actitime.com/login.do");
		WebElement headerText = driver.findElement(By.id("headerContainer"));
		String headerTagText = headerText.getText();
		System.out.println("headerTagText = "+headerTagText);
		String headerTagName = headerText.getTagName();
		System.out.println("headerTagName = "+headerTagName);
		String headerIdsAttrvalue = headerText.getAttribute("id");
		System.out.println("headerIdsAttrvalue = "+headerIdsAttrvalue);
		Thread.sleep(3000);
		driver.quit();
	}		
}
	
