package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClose {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// instantiate browser specific class
		WebDriver driver = new ChromeDriver();

		//driver.close(); (It will not close chrome.exe file  in task manger only closes apllication ,so terminate post condition always should be quit method)
		driver.quit();
	}
}
