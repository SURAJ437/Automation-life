
package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser Class
		WebDriver driver = new ChromeDriver();
		//Pass the main URL of the application 
		driver.get("http://www.leafground.com/pages/Window.html");
		//Click on the Button for Child Window...?
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Get the Parent window ID by getWindowHandle()
		String parentWindowId = driver.getWindowHandle();
		//Get all the window Id's in the current Session
		Set<String> allWindowIds = driver.getWindowHandles();
		//driver.close();
		//Print all the captured window Id's 
		System.out.println("allWindowIds = " + allWindowIds);
		//Get window Id iteratively one at a time from Set<String>
		for (String wid : allWindowIds) {
			//Print all the window ID iteratively
			System.out.println("wid = " + wid);
			//transfer the driver control from the current window to the wid under this iteration
			//get the title of the windown under iteration
			String windowTitle = driver.switchTo().window(wid).getTitle();
			//Print the window title under iteration 
			System.out.println("windowTitle = " + windowTitle);	
			//Close the parent window upon the validation of its title
			if (windowTitle.equals("TestLeaf - Interact with Windows")) {
				driver.quit();
			}
		}
	}
}