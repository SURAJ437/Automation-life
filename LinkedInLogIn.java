package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogIn {
	public static void main(String[] args) throws Throwable {
		//Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		// Pre Condition
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Pass the main URL of the application
		driver.get("https://www.linkedin.com/");
		Thread.sleep(3000);
		//To get the title of the Login page
		driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
		Thread.sleep(3000);
		 WebElement usernametextfield = driver.findElement(By.id("username"));
		 usernametextfield.sendKeys("surajsajjan84@gmail.com");
		 Thread.sleep(3000);
		 WebElement passwordtextfield = driver.findElement(By.id("password"));
		 passwordtextfield.sendKeys("7353Link");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div/button[text()='Sign in']")).click();
		 Thread.sleep(2000);
		 String actualHomePageTitle = driver.getTitle();
		 System.out.println("actualHomePageTitle:"+actualHomePageTitle);
		 String expectedHomePageTitle = "(46) Feed | LinkedIn";
		 if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			 System.out.println("Home page Title is correct");
		 }
		 else
		 {
			 System.out.println("Home page Title is incorrect");
		 }
		 driver.quit();
	}
}
