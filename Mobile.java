package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		WebElement searchfield = driver.findElement(By.name("q"));
		Thread.sleep(5000);
		searchfield.sendKeys("RED MI 9A (MIDNIGHT BLACK, 32GB)");
		Thread.sleep(3000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (Midnight Black, 32 GB)'][1]/../..//div[@class='_30jeq3 _1_WHN1'][1]"));
		Thread.sleep(5000);
		driver.quit();
	}
}
