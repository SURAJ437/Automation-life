package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tdTagText = driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following-sibling::td")).getText();
		System.out.println("tdTagText = "+tdTagText);
		driver.quit();
	}
	
}
