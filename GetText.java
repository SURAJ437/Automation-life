package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	String expectedText = "Please identify yourself";
	System.out.println("expectedText = " + expectedText);
	String actualText  = driver.findElement(By.id("headerContainer")).getText();
	System.out.println("actualText = " + actualText );
	if (expectedText.equals(actualText)) {
		System.out.println("Pass: The Header text is verfied and it's found correct");
	}else {
		System.out.println("Fail: The Header text is verified and it's found incorrect ");
	}
	Thread.sleep(5000);
	driver.quit();
}
}