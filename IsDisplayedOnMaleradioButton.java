package isdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedOnMaleradioButton {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("\"https://www.facebook.com/signup\"");
	if (driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']")).isDisplayed()) {
		System.out.println(" ");
		
	}
		{
			
		}
}
}