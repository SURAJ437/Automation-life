package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonofactiTime {
	public static void main(String[] args) {
		//set the driver executable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiate the browser specific class
			WebDriver driver = new ChromeDriver();
			//Maximize the window
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			if (driver.findElement(By.id("loginButton")).isEnabled()) {
				System.out.println("True");
				System.out.println("Pass: The login Button is Enabled");	
			}else {
				System.out.println("False");
				System.out.println("Fail:The login Buton is not Enabled Condition ");
			}
			driver.quit();
	}
}
