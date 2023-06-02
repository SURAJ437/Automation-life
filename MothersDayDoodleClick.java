package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MothersDayDoodleClick {
	public static void main(String[] args) throws Throwable {
		//Set the browser executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Pre Condition maximize the browser window
		driver.manage().window().maximize();
		// To pass the main URL of the application
		driver.get("https://www.google.com/doodles");
		// click on mothers day doodle
		// No such element excption bcz target elemennt is not their in view port area(LINE NO:23)
		driver.findElement(By.partialLinkText(" Mother's Day 2010")).click();
		Thread.sleep(5000);
		// To terminate the session
		driver.quit();
		//NoSuchelementException will thrown bcz of  no element in view port area but it is in DOM
}
}
