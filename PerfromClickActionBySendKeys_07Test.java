package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerfromClickActionBySendKeys_07Test {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Actions actions = new Actions(driver);
		actions.sendKeys(loginButton, Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
