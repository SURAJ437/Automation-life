package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetTitle {
	public static void main(String[] args) {
		//Set the driver Executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantite the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("https://www.drdo.gov.in/");
		String expectedDrdoTitle = "Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
		System.out.println("expectedDrdoTitle= "+expectedDrdoTitle);
		//Get the Title of the WebPage
		String actualDrdoTitle = driver.getTitle();
		System.out.println("ActualDrdoTitle= "+actualDrdoTitle);
		//validate the Title of the web page
		if(expectedDrdoTitle.equals(actualDrdoTitle)) {
			System.out.println("Pass:The DRDO webpage Title is correct");
		}
		else
			System.out.println("Fail:The DRDO webpage Title is incorret");
		driver.quit();
		}	
	}

