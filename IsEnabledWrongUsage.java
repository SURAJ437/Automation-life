package isenabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledWrongUsage {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//td//a[contains(@class,'license')]")).click();
		Thread.sleep(5000);
		boolean downloadButton = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']")).isEnabled();
		Thread.sleep(5000);
		if (downloadButton) {
			System.out.println("Expecting Boolean True");
			System.out.println("Actual returning Object of IsEnabled() = "+downloadButton);
			System.out.println("Fail:The download Button is Enabled");//Bcz we are trying for disability of Button
		}else {
			System.out.println("Expecting Boolean False");
			System.out.println("Actual returning Object of IsEnabled() = "+downloadButton);
			System.out.println("Pass:The Download button is Disabled");
		}
		driver.quit();
	}
}