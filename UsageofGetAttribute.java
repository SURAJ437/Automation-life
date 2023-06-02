package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetAttribute {
	public static void main(String[] args) throws Throwable {
		// Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://www.flipkart.com/");

		String expectedalternatetext = "Flipkart";
		System.out.println("expectedalternatetext = "+expectedalternatetext);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		String actualalternatetext = driver.findElement(By.cssSelector("img[title='Flipkart']")).getAttribute("alt");
		System.out.println("actualalternatetext = "+ actualalternatetext);
		if (actualalternatetext.equals(actualalternatetext)) {
			System.out.println("Pass: The alternative text of FLipkart LOGO is correct");

		} else {
			System.out.println("Fail:The alternative text of FLipkart LOGO is incorrect ");

		}
		Thread.sleep(5000);
		driver.quit();

	}
}