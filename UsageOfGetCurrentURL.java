package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
	public static void main(String[] args) {
		//Set the driver Executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantite the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		String expectedCurrentUrl = "https://demo.actitime.com/login.do?username";
		System.out.println("expectedCurrentUrl= "+expectedCurrentUrl);
		//To get the current URL of of the webpage
		String actualCurrentUrl = driver.getCurrentUrl();
	//	String pagesource = driver.getPageSource();
   //	System.out.println("Pagesource : "+pagesource);
		System.out.println("actualCurrentUrl= "+actualCurrentUrl);
		if(expectedCurrentUrl.contains(actualCurrentUrl)) {
			System.out.println("Pass:The current URL of the loginpage is correct");
		}
		else
			System.out.println("Fail:The current URL of the loginpage is incorrect");
		driver.quit();
	}
}

