package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NBTINDIA {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.nbtindia.gov.in/");
		driver.findElement(By.name("search")).sendKeys("INDIA");
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-default btn-lg")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
