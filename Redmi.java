package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redmi {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("REDMI");
		driver.findElement(By.className("L0Z3Pu"));
		//WebElement pricetag = driver.findElement(By.xpath("//div[text()=REDMI Note 10T 5G (Metallic Blue, 64 GB)'] /../..//div[@class='_30jeq3 _1_WHN1']"));
		//WebElement pricetag = driver.findElement(By.xpath("//div[text()='REDMI Note 10T 5G (Metallic Blue, 64 GB)']//ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(5000);
		driver.quit();
	}
}
