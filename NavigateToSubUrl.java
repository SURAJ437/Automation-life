package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        //Usage of to(URL url)
public class NavigateToSubUrl {
	   public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// Set the driver executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		// Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		//Create the object from URL class of java\
		//Select the constructor of which is type URL(String spec)
		// name the object as main URL of the application to build the URL further
		URL dassaultmainUrl = new URL("https://www.dassault-aviation.com/en/");
		//constructor overloading
		//URL(URL context, String spec)
		URL dassaultSubUrlDefence = new URL(dassaultmainUrl, "defense/");
		//Navigate Object contains two methods with same nabe but different arguments
		// to(URL url)
		//method overloading
		// Pass the suburl reference variable as input to(URL url)
		driver.navigate().to(dassaultSubUrlDefence);
		Thread.sleep(5000);
		URL dassaultSubUrlCivil = new URL(dassaultmainUrl, "civil/");
		driver.navigate().to(dassaultSubUrlCivil);
		Thread.sleep(5000);
		URL dassaultSubUrlSpace = new URL(dassaultmainUrl, "space/");
		driver.navigate().to(dassaultSubUrlSpace);
		Thread.sleep(5000);
		URL dassaultSubUrlPassion = new URL(dassaultmainUrl, "passion/");
		driver.navigate().to(dassaultSubUrlPassion);
		 Thread.sleep(5000);
		//Terminate the session
		driver.quit();
	}	
}
