package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInJobsClick {
	public static void main(String[] args) throws Throwable {
		//Set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		//pre condition
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.linkedin.com/");
		Thread.sleep(5000);
		//click on jobs
	//	driver.findElement(By.xpath("//a[contains(@href,'jobs-in-bengaluru?trk=homepage-basic_guest_nav_menu_jobs')]")).click();
		//click on joinnow (anchortag thats why using linltext)
		driver.findElement(By.linkText("Join now")).click();
		Thread.sleep(5000);
		//post condition
		driver.quit();

}
}