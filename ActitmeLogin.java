package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitmeLogin {
	public static void main(String[] args) throws FileNotFoundException, IOException, Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 FileInputStream fis = new FileInputStream("./src/testdata/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
