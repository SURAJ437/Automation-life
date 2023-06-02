package getthescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelementscreenshot {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement loginbuttonelement = driver.findElement(By.name("login"));
		File tempfile = loginbuttonelement.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/loginbutton"+timeStamp+".png");

		FileUtils.copyFile(tempfile, destfile);
		driver.quit();
	}
}
