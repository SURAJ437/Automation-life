package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition01 {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre Condition
		// Maximize the browser window 
		driver.manage().window().maximize();
		//pass the main URL of the application
		driver.get("http://www.leafground.com/pages/Window.html");
		// find the open multiple windows button and perform click action on it
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Dimension sizeOfParentWindow = driver.manage().window().getSize();
		//System.out.println("Parent Window Height = " + sizeOfParentWindow.getHeight());
		//System.out.println("Parent Window Width = " + sizeOfParentWindow.getWidth());
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("No of Wiondows = " + windowIds.size());
		for (String wid : windowIds) {
			String windowTitle=driver.switchTo().window(wid).getTitle();
			System.out.println("windowTitle = " + windowTitle);

			if(windowTitle.equals("TestLeaf - Interact with Buttons")) {
				Dimension sizeOfButtonChildWindow = driver.switchTo().window(wid).manage().window().getSize();
				int ButtonWindiowHeight = sizeOfButtonChildWindow.getHeight();
				int ButtonWindiowwidth = sizeOfButtonChildWindow.getWidth();
				System.out.println("ButtonWindiowHeight = " + ButtonWindiowHeight);
				System.out.println("ButtonWindiowwidth = " + ButtonWindiowwidth);
				 Point ButtonWindowPosition = driver.manage().window().getPosition();
				int ButtonStartX = ButtonWindowPosition.getX();
				int ButtonStartY = ButtonWindowPosition.getY();
				System.out.println("ButtonStartX = " + ButtonStartX);
				System.out.println("ButtonStartY = " + ButtonStartY);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
			}


			//=driver.switchTo().window(wid).manage().window().getSize();
		}
	}
}
//Terminate the Session 
//driver.quit();