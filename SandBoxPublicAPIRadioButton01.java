package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandBoxPublicAPIRadioButton01 {
	public static void main(String[] args) {
	//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	if (driver.findElement(By.id("flexRadioDefault1")).isEnabled()) {
		System.out.println("Pass: The public radio button is enabled");
	}else {
		System.out.println("Fail: the Public radio button is disabled");
	}
	driver.quit();
	}
}
