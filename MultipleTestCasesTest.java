package ngtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTestCasesTest {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void launchBrowserTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("launchBrowserTest executed");
	}

	/*
	 * public void synchroizationTest() {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10)); }
	 */
	@Test (priority = 3)
	public void actitimeLoginTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("actitimeLoginTest executed ");
	}
	@Test (priority = 1)
	public void vtigerLoginTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		System.out.println("vtigerLoginTest executed");
	}
	@AfterClass
	public void actitimeLogoutTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("actitimeLogoutTest executed");

		//driver.quit();
	}
	@Test(priority = 2)
	public void vtigerLogoutTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@class='userName dropdown-toggle pull-right']")).click();
		driver.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']")).click();
		System.out.println("vtigerLogoutTest executed");
	}
}
