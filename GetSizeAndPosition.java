package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neilalexander.jnacl.crypto.poly1305;

public class GetSizeAndPosition {

	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific Class
		WebDriver driver = new ChromeDriver();
		// Pre condition
		// maximixze the browser window
		driver.manage().window().maximize();
		// pass the main url of the application
		driver.get("http://www.leafground.com/pages/Window.html");
		//Find the open multiple window button and prform click action on it
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Dimension sizeofparentWindow = driver.manage().window().getSize();
		//System.out.println("parent Window Hieght= " + sizeofparentWindow.getHeight());
		//System.out.println("Parent Window width=  "+ sizeofparentWindow.getWidth());
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Number of windowIds = "+windowIds.size());
		for (String wid : windowIds) {
			String windowTitle = driver.switchTo().window(wid).getTitle();
			System.out.println("windowTitle = "+ windowTitle);

         if(windowTitle.equals("TestLeaf - Interact with HyperLinks")) {
        	Dimension sizeOfHyprelinkChildWindow = driver.switchTo().window(wid).manage().window().getSize();
        	int hyperlinkWindowHeight = sizeOfHyprelinkChildWindow.getHeight();
        	int hyperlinkWindowwidth = sizeOfHyprelinkChildWindow.getWidth();
        	System.out.println("hyperlinkWindowHieght= "+hyperlinkWindowHeight);
        	System.out.println("hyperlinkWindowWidth= "+hyperlinkWindowwidth);
          Point hyperlinkWindowPosition = driver.manage().window().getPosition();
        	int hyperlinkStartX = hyperlinkWindowPosition.getX();
        			int hyperlinkStartY = hyperlinkWindowPosition.getY();
        			System.out.println("hyperlinkStartX = "+hyperlinkStartX);
        			System.out.println("hyperlinkStartY = "+hyperlinkStartY);
        			driver.manage().window().maximize();
        			Thread.sleep(5000);
        	 driver.close();
         }
	   
		//Terminate the session
       //  driver.quit();
		
			}
}
}