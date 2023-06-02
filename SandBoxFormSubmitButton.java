package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandBoxFormSubmitButton {
	public static void main(String[] args) {
	//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		// check for the enability of the submit button
		//submit button disabled form
		// Boolean - False
		// Submit button will be checked for disability
		boolean submitButton = driver.findElement(By.name("submit")).isEnabled();
		if (submitButton) {
			//System.out.println("True");
			System.out.println("Fail: The Submit Button is Enabled");
		}else {
			//System.out.println("False");
			System.out.println("Pass: The Submit Button is disabled upon Verification");
		}
		driver.quit();
}
}